package br.com.studies.patterns.creationals.factory_method;

public class Truck implements Transport {
    @Override
    public String getDelivery() {
        return "Truck delivery";
    }
}
