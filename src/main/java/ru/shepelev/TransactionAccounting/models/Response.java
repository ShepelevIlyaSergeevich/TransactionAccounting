package ru.shepelev.TransactionAccounting.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Request {
    private Meta meta;
    private List<Trade> values;
    private String status;
}
