package org.example;

public class AbstractBeverage implements Beverage {
    protected String name;
    protected String description;
    protected double cost;
    protected String size;
    protected String milk;
    protected String sweetener;
    protected int shots;
    protected boolean isHot;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public double getCost() {
        return cost;
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
