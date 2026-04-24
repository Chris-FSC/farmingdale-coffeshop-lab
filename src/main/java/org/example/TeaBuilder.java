package org.example;

public class TeaBuilder extends BeverageBuilder {
    public TeaBuilder() {
        beverage = new Tea();
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
