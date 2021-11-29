package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public class StandardDiscount extends Discount{
    public StandardDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal applyDiscount(Order order) {
        return order.getPrice().multiply(new BigDecimal("0.03"));
    }

    @Override
    protected boolean isDiscount(Order order) {
        return order.getPrice().doubleValue() > 499;
    }
}
