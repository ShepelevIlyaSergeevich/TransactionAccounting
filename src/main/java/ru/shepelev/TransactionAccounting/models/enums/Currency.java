package ru.shepelev.TransactionAccounting.models;

public enum Currency {
    KZT("KZT"),
    RUB("RUB"),
    USD("USD");

    private final String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }
}
