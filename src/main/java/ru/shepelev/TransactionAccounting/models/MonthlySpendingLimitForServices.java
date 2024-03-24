package ru.shepelev.TransactionAccounting;

public class MonthlySpendingLimitForServices {
    private Integer value = 1000;
    private Currency currency = Currency.USD;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
