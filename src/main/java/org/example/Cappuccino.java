package org.example;

public class Cappuccino implements Beverage {
    private String name = "Cappuccino";
    private String milk;
    private String size;
    private int shots;
    private String sweetener;

    public Cappuccino(Size size, Milk milk, Sweetener sweetener, int shots) {
        this.size = size.toString();
        this.milk = milk.toString();
        this.sweetener = sweetener.toString();
        this.shots = shots;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return String.format("%s Cappuccino with %s milk, %d shots, and %s sweetener", size, milk, shots, sweetener);
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
        return shots;
    }
    @Override
    public boolean isHot() {
        return true;
    }
    @Override
    public String getSweetener() {
        return sweetener;
    }
}