package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    protected BigDecimal applyDiscount(Order order) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean isDiscount(Order order) {
        return order.getPrice().doubleValue() < 500;
    }
}
