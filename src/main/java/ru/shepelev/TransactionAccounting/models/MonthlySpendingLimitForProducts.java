package ru.shepelev.TransactionAccounting.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import ru.shepelev.TransactionAccounting.models.enums.Currency;

import java.time.OffsetDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class MonthlySpendingLimitForExpenses {
    @Id
    private Long id;
    private Integer value = 1000;
    private OffsetDateTime dateOfEstablishment;
}
