package br.com.studies.patterns.structural.decorator;

import java.math.BigDecimal;

public class Frappuccino extends CoffeeDecoratror {
    public Frappuccino(Coffee coffee) {
        super(coffee);
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(1.5));
    }

    @Override
    public String ingredients() {
        return super.ingredients() + ", cream and chocolate (Frappuccino)";
    }
}
