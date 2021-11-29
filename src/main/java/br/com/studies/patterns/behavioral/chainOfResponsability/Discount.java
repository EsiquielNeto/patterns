package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount nextDiscount;

    public Discount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    public BigDecimal calculate(Order order) {
        if (isDiscount(order)) {
            return applyDiscount(order);
        }

        return nextDiscount.calculate(order);
    }

    protected abstract BigDecimal applyDiscount(Order order);
    protected abstract boolean isDiscount(Order order);
}
