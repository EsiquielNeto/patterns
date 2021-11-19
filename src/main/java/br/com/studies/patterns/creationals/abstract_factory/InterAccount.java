package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;

public class InterAccount extends Account {

    public InterAccount(String cliente, String accountNumber, String agency) {
        super(cliente, accountNumber, agency);
        this.draftRate = new BigDecimal("7.0");
    }
}
