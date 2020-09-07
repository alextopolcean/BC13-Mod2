package de.telran.application;

import de.telran.data.TV;

public class TVApplication {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV("Samsung", "7-Serie", 55);
        tv1.setColor("silver");
        tv1.setBrand("Philips");
        System.out.println(tv1.getColor());
        System.out.println(tv2.getBrand());
        tv1.setPrice(1000);
        System.out.println(tv1.getPrice());
        System.out.println(tv1);
        System.out.println(tv2);
        tv1.tvVoltage();


    }
}
