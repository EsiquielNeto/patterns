package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Account implements AccountFunctions {
    String cliente;
    String accountNumber;
    String agency;
    BigDecimal balance;
    BigDecimal draftRate;

    public Account(String cliente, String accountNumber, String agency) {
        this.cliente = cliente;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = BigDecimal.ZERO;
    }

    @Override
    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public void draft(BigDecimal moneyDraft) {
        if (checkBalance()) {
            throw new RuntimeException("You don't have enough balance");
        }
        BigDecimal result = moneyDraft.subtract(draftRate);
        balance = balance.subtract(result);
    }

    @Override
    public void deposit(BigDecimal moneyDeposit) {
        balance = balance.add(moneyDeposit);
    }

    @Override
    public boolean checkBalance() {
        return balance.compareTo(BigDecimal.ZERO) < 0;
    }
}
