package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;

public class NuAccount extends Account {

    public NuAccount(String cliente, String accountNumber, String agency) {
        super(cliente, accountNumber, agency);
        this.draftRate = new BigDecimal("6.0");
    }
}
