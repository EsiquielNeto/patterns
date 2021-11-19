package br.com.studies.patterns.creationals.abstract_factory;


import java.math.BigDecimal;

public class BradescoAccount extends Account {

    public BradescoAccount(String cliente, String accountNumber, String agency) {
        super(cliente, accountNumber, agency);
        this.draftRate = new BigDecimal("5.0");
    }
}