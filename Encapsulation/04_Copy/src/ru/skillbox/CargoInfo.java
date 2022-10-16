package ru.skillbox;

public class CargoInfo {
    private final Dimensions multiDimensions;
    private final int weight;
    private final String address;
    private final boolean rotate;
    private final String regNumber;
    private final boolean fragile;

    public CargoInfo(Dimensions dimensions, int weight, String address, boolean rotate,
                     String regNumber, boolean fragile) {
        multiDimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.rotate = rotate;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public CargoInfo() {
        multiDimensions = null;
        weight = 0;
        address = "na";
        rotate = true;
        regNumber = "na";
        fragile = true;
    }

    public CargoInfo setAddress(String address) {
        return new CargoInfo(multiDimensions, weight, address, rotate, regNumber, fragile);
    }

    public CargoInfo setMultiDimensions(Dimensions dimensions) {
        return new CargoInfo(dimensions, weight, address, rotate, regNumber, fragile);
    }

    public CargoInfo setWeight(int weight) {
        return new CargoInfo(multiDimensions, weight, address, rotate, regNumber, fragile);
    }

    public Dimensions getMultiDimensions() {
        return multiDimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean isRotate() {
        return rotate;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString() {
        return "Объем груза - " + multiDimensions.getVolume() + "\n" +
                "Вес - " + weight + "\n" +
                "Адрес - " + address + "\n" +
                "Можно ли переворачивать - " + (rotate ? "Можно" : "Нельзя") + "\n" +
                "Регистрационный номер - " + regNumber + "\n" +
                "Хрупкий груз - " + (fragile ? "Хрупкий" : "Не хрупкий");
    }
}
