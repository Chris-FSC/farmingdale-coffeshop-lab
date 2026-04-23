package org.example;

public class Latte implements Beverage {
    private String name;
    private String description;
    private double cost;
    private String Milk;
    private String size;
    private String sweetener;
    private int shots;
    private boolean isHot;

    public Latte(String name, String description, double cost) {
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
        return espressoShots;
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