package br.com.studies.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class PacFreight implements Freight{
    @Override
    public BigDecimal freightCalculation(BigDecimal distance) {
        return distance.multiply(new BigDecimal("1.25"));
    }
}
