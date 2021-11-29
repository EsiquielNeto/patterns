package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public class Order {

    private BigDecimal price;
    private int quantityItens;

    public Order(BigDecimal price, int quantityItens) {
        this.price = price;
        this.quantityItens = quantityItens;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantityItens() {
        return quantityItens;
    }
}
