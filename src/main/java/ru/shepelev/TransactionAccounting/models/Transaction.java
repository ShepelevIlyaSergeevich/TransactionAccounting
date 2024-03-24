package ru.shepelev.TransactionAccounting;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transactions_sequence")
    @SequenceGenerator(name = "transactions_sequence")
    private Long id;
    private String fromAccount;
    private String toAccount;
    private Double balance;
    @Enumerated(value = EnumType.STRING)
    private Currency currency;
}
