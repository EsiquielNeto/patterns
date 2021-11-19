package br.com.studies.patterns.creationals.abstract_factory;

import java.math.BigDecimal;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Account nu = new NuAccount("Poka", "5555-9", "0001");
        Account bradesco = new BradescoAccount("Maria", "12345-7", "1033");

        System.out.println("<---------- Deposit ---------->");
        nu.deposit(new BigDecimal("2000.80"));
        bradesco.deposit(new BigDecimal("5600.60"));
        System.out.println(nu.getBalance());
        System.out.println(bradesco.getBalance());


        System.out.println("\n<---------- Balance ----------->");
        nu.draft(new BigDecimal("100"));
        bradesco.draft(new BigDecimal("3000"));


        System.out.println(nu.getBalance());
        System.out.println(bradesco.getBalance());

    }
}
