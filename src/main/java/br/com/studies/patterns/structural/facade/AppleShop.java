package br.com.studies.patterns.structural.facade;

public class AppleShop implements MobileShop{
    @Override
    public void printDeviceInfo() {
        System.out.println("Iphone13");
        System.out.println("R$ 10.000,00");
    }
}
