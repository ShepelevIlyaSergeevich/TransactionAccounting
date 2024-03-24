package ru.shepelev.TransactionAccounting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.shepelev.TransactionAccounting.models.MonthlySpendingLimitForExpenses;

public interface MonthlySpendingLimitForExpensesRepository extends JpaRepository<MonthlySpendingLimitForExpenses, Long> {
}
