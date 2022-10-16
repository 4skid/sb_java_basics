package ru.skillbox;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(2,9,3);
        CargoInfo cargoInfo = new CargoInfo(
                dimensions,
                2,
                "ул. Лесная",
                true,
                "4353839",
                true);
        System.out.println(cargoInfo);
        System.out.println();
        System.out.println(cargoInfo.setAddress("ул. Полевая"));
        System.out.println();
        System.out.println(cargoInfo.setMultiDimensions(new Dimensions(3, 5, 6)));
        System.out.println();
        System.out.println(cargoInfo.setWeight(11));

    }
}
