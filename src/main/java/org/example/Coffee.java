package org.example;

public class Coffee implements Beverage {
    private String name;
    private String description;
    private double cost;
    private String size;
    private String milk;
    private String sweetener;
    private int shots;
    private boolean isHot;


    public Coffee(String name, String description, double cost) {
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