package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public class ItemDiscount extends Discount {

    public ItemDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected BigDecimal applyDiscount(Order order) {
        return order.getPrice().multiply(new BigDecimal("0.3"));
    }

    @Override
    protected boolean isDiscount(Order order) {
        return order.getQuantityItens() > 3;
    }
}
