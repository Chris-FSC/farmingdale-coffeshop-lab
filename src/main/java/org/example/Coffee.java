package org.example;

public class Coffee implements Beverage {
    private String name = "Coffee";
    private String size;
    private String milk;
    private String sweetener;
    private boolean isHot;

    public Coffee(Size size, Milk milk, Sweetener sweetener, boolean isHot) {
        this.size = size.toString();
        this.milk = milk.toString();
        this.sweetener = sweetener.toString();
        this.isHot = isHot;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        String temp = isHot ? "Hot" : "Iced";
        return String.format("%s %s coffee with %s milk and %s sweetener", temp, size, milk, sweetener);
    }
    @Override
    public String getSize() {
        return size;
    }
    @Override
    public String getMilk() {
        return milk;
    }
    @Override
    public int getShots() {
        return -1;
    }
    @Override
    public boolean isHot() {
        return isHot;
    }
    @Override
    public String getSweetener() {
        return sweetener;
    }
}