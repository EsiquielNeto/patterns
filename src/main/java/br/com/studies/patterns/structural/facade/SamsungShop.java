package br.com.studies.patterns.structural.facade;

public class SamsungShop implements MobileShop{
    @Override
    public void printDeviceInfo() {
        System.out.println("Galaxy s20");
        System.out.println("R$ 45000,00");
    }
}
