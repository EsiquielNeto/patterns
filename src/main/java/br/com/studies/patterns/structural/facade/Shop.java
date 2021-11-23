package br.com.studies.patterns.structural.facade;

public class Shop {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop xiaomi;

    public Shop() {
        iphone = new AppleShop();
        samsung = new SamsungShop();
        xiaomi = new XiaomiShop();
    }

    public void iphoneSale() {
        iphone.printDeviceInfo();
    }

    public void galaxySale() {
        samsung.printDeviceInfo();
    }

    public void redmiSale() {
        xiaomi.printDeviceInfo();
    }
}
