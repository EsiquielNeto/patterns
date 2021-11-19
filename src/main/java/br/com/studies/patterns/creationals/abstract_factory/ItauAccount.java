package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;

public class ItauAccount extends Account {

    public ItauAccount(String cliente, String accountNumber, String agency) {
        super(cliente, accountNumber, agency);
        this.draftRate = new BigDecimal("4.0");
    }
}