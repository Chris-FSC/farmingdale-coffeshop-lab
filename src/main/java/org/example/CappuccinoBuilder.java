package org.example;

public class CappuccinoBuilder extends BeverageBuilder {
    public CappuccinoBuilder() {
        beverage = new Cappuccino();
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
