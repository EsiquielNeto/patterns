package br.com.studies.patterns.behavioral.strategy;

import java.math.BigDecimal;

public interface Freight {
    BigDecimal freightCalculation(BigDecimal distance);
}
