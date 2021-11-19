package br.com.studies.patterns.creationals.factory_method;

public class TransportFactory {

    public static Transport create(DeliveryType type) {
        switch (type) {
            case BOX:
                return new Truck();
            case CONTAINER:
                return new Ship();
            default:
                throw new IllegalArgumentException("No delivery type");
        }

    }
}
