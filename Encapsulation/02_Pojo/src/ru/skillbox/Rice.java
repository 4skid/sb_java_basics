package ru.skillbox;

public class Rice {
    private String name; // сорт риса
    private double length; // длина зерна риса
    private String color; // цвет зерна
    private double cookingTime; // время варки

    public Rice(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void print() {
        System.out.println(getName() + " - " + getLength());

    }
}

