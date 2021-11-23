package br.com.studies.patterns.structural.decorator;

import java.math.BigDecimal;

public class BlackCoffee implements Coffee{
    @Override
    public BigDecimal price() {
        return new BigDecimal("1.00");
    }

    @Override
    public String ingredients() {
        return "Coffee";
    }

    @Override
    public void printInfo() {
        System.out.println("===== Coffe =====");
        System.out.println("ingredients: " + this.ingredients());
        System.out.println("price: " + this.price());
        System.out.println("=================\n");
    }
}
