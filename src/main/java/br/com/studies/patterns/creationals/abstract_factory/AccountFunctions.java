package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;

public interface AccountFunctions {

    BigDecimal getBalance();
    void draft(BigDecimal moneyDraft);
    void deposit(BigDecimal moneyDeposit);
    boolean checkBalance();
}
