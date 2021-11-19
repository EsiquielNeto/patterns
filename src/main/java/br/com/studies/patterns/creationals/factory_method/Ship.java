package br.com.studies.patterns.creationals.factory_method;

public class Ship implements Transport {
    @Override
    public String getDelivery() {
        return "Ship delivery";
    }
}
