package org.example;

public class CoffeeBuilder extends BeverageBuilder {
    public CoffeeBuilder() {
        beverage = new Coffee();
    }
    public BeverageBuilder setSize(String size) {
        beverage.size = size;
        return this;
    }
    public BeverageBuilder setMilk(String size) {
        beverage.milk = milk;
        return this;
    }
    public BeverageBuilder setSweetener(String sweetener) {
        beverage.sweetener = sweetener;
        return this;
    }
    public BeverageBuilder setShots(int shots) {
        beverage.shots = shots;
        return this;
    }
    public BeverageBuilder setTemp(boolean isHot) {
        beverage.isHot = isHot;
        return this;
    }
}
