package org.example;

public class Latte implements Beverage {
    private String name = "Latte";
    private String milk;
    private String size;
    private String sweetener;
    private int shots = 1;
    private boolean isHot;

    public Latte(Size size, Milk milk, Sweetener sweetener, int shots, boolean isHot) {
        this.size = size.toString();
        this.milk = milk.toString();
        this.sweetener = sweetener.toString();
        this.shots = shots;
        this.isHot = isHot;
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        String temp = isHot ? "Hot" : "Iced";
        return String.format("%s %s latte with %s milk, %d shots and %s sweetener", temp, size, milk, shots, sweetener);
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
        return isHot;
    }
    @Override
    public String getSweetener() {
        return sweetener;
    }
}