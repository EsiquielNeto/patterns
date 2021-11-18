package br.com.studies.patterns.creationals.factory;

public class Truck implements Transport {
    @Override
    public String getDelivery() {
        return "Truck delivery";
    }
}
