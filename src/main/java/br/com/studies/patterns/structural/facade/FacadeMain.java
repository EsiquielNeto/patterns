package br.com.studies.patterns.structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        System.out.print("========= Mobile Shop ============ \n");
        shop.iphoneSale();
        shop.galaxySale();
        shop.redmiSale();
        System.out.print("================================= \n");
    }
}
