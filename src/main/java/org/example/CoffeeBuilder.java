package org.example;

public class CoffeeBuilder extends BeverageBuilder {
    public CoffeeBuilder() {
        beverage = new Coffee();
    }
    @Override
    public BeverageBuilder setSize(String size) {
        beverage.size = size;
        return this;
    }
    @Override
    public BeverageBuilder setMilk(String milk) {
        beverage.milk = milk;
        return this;
    }
    @Override
    public BeverageBuilder setSweetener(String sweetener) {
        beverage.sweetener = sweetener;
        return this;
    }
    @Override
    public BeverageBuilder setShots(int shots) {
        beverage.shots = shots;
        return this;
    }
    @Override
    public BeverageBuilder setTemp(boolean isHot) {
        beverage.isHot = isHot;
        return this;
    }
}
