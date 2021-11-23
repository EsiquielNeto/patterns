package br.com.studies.patterns.structural.facade;

public class XiaomiShop implements MobileShop{
    @Override
    public void printDeviceInfo() {
        System.out.println("redmi 10");
        System.out.println("R$ 2000,00");
    }
}
