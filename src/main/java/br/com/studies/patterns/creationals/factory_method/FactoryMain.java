package br.com.studies.patterns.creationals.factory_method;

public class FactoryMain {

    public static void main(String[] args) {
         Transport truck= TransportFactory.create(DeliveryType.BOX);
        System.out.println(truck.getDelivery());

        Transport ship = TransportFactory.create(DeliveryType.CONTAINER);
        System.out.println(ship.getDelivery());
    }
}
