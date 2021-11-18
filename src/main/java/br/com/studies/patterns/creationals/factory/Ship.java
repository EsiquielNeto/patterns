package br.com.studies.patterns.creationals.factory;

public class Ship implements Transport {
    @Override
    public String getDelivery() {
        return "Ship delivery";
    }
}
