package br.com.studies.patterns.structural.decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        coffee.printInfo();

        Coffee latte = new Latte(coffee);
        latte.printInfo();

        Coffee frappuccino = new Frappuccino(coffee);
        frappuccino.printInfo();
    }
}
