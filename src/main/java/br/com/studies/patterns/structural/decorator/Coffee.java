package br.com.studies.patterns.structural.decorator;

import java.math.BigDecimal;

public interface Coffee {
    BigDecimal price();
    String ingredients();
    void printInfo();
}
