package org.example;

public class Tea implements Beverage {
    private String name = "Tea";
    private String milk;
    private String size;
    private String sweetener;
    private boolean isHot;

    public Tea(Size size, Milk milk, Sweetener sweetener, boolean isHot) {
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
        return String.format("%s tea with %s milk and %s sweetener", size, milk, sweetener);
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