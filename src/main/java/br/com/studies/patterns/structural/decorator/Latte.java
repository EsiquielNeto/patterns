package br.com.studies.patterns.structural.decorator;

import java.math.BigDecimal;

public class Latte extends CoffeeDecoratror{
    public Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(0.5));
    }

    @Override
    public String ingredients() {
        return super.ingredients() + "and milk (Latte)";
    }
}
