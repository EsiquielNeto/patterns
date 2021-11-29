package br.com.studies.patterns.behavioral.strategy;

import java.math.BigDecimal;

public class StrategyMain {
    public static void main(String[] args) {
        FreightType pacFreight = FreightType.PAC;
        Freight pac = pacFreight.getFreight();
        System.out.println(pac.freightCalculation(new BigDecimal("10")));

        FreightType sedexFreight = FreightType.SEDEX;
        Freight sedex = sedexFreight.getFreight();
        System.out.println(sedex.freightCalculation(new BigDecimal("1")));

        FreightType premiumFreight = FreightType.PREMIUM;
        Freight premium = premiumFreight.getFreight();
        System.out.println(premium.freightCalculation(new BigDecimal("2")));

    }
}
