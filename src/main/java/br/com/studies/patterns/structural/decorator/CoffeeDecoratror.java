package br.com.studies.patterns.structural.decorator;

import java.math.BigDecimal;

public abstract class CoffeeDecoratror implements Coffee{
    private final Coffee coffeeDecoratror;

    public CoffeeDecoratror(Coffee coffee) {
        this.coffeeDecoratror = coffee;
    }

    @Override
    public BigDecimal price() {
        return coffeeDecoratror.price();
    }

    @Override
    public String ingredients() {
        return coffeeDecoratror.ingredients()   ;
    }

    public Coffee getCoffeeDecoratror() {
        return coffeeDecoratror;
    }

    @Override
    public void printInfo() {
        System.out.println("===== Coffe =====");
        System.out.println("ingredients: " + this.ingredients());
        System.out.println("price: " + this.price());
        System.out.println("=================\n");
    }
}
