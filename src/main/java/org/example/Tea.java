package org.example;

public class Tea implements Beverage {
    private String name = "Tea";
    private String milk = "No";
    private String size;
    private String sweetener = "No";
    private boolean isHot;

    public Tea(Size size, Sweetener sweetener, boolean isHot) {
        this.size = size.toString();
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
        return String.format("%s %s tea with %s milk and %s sweetener", temp, size, milk, sweetener);
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
        return 0;
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