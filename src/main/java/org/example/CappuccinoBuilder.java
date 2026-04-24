package org.example;

public class CappuccinoBuilder extends BeverageBuilder {
    public CappuccinoBuilder() {
        beverage = new Cappuccino();
    }
    @Override
    public BeverageBuilder setSize(String size) {
        ((AbstractBeverage) beverage).setSize(size);
        return this;
    }
    @Override
    public BeverageBuilder setMilk(String milk) {
        ((AbstractBeverage) beverage).setMilk(milk);
        return this;
    }
    @Override
    public BeverageBuilder setSweetener(String sweetener) {
        ((AbstractBeverage) beverage).setSweetener(sweetener);
        return this;
    }
    @Override
    public BeverageBuilder setShots(int shots) {
        ((AbstractBeverage) beverage).setShots(shots);
        return this;
    }
    @Override
    public BeverageBuilder setHot(boolean isHot) {
        ((AbstractBeverage) beverage).setHot(isHot);
        return this;
    }
}
