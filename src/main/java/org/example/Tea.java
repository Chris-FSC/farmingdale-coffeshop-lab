package org.example;

public class Tea implements Beverage {
    private String name;
    private String description;
    private double cost;
    private String milk;
    private String size;
    private String sweetener;
    private boolean isHot;

    public Tea(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

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