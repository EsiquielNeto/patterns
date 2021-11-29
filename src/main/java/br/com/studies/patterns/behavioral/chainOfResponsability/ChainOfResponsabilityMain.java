package br.com.studies.patterns.behavioral.chainOfResponsability;

import java.math.BigDecimal;

public class ChainOfResponsabilityMain {

    public static void main(String[] args) {
        Order orderA = new Order(new BigDecimal("550"), 1);
        Order orderB = new Order(new BigDecimal("300"), 4);
        Order orderC = new Order(new BigDecimal("100"), 1);

        Discount discount = new StandardDiscount(new ItemDiscount(new NoDiscount()));
        System.out.println(discount.calculate(orderA));
        System.out.println(discount.calculate(orderB));
        System.out.println(discount.calculate(orderC));
    }
}
