package org.example;

public class LatteBuilder extends BeverageBuilder {
    public LatteBuilder() {
        beverage = new Latte();
    }
    public BeverageBuilder setSize(String size) {
        beverage.size = size;
        return this;
    }
    public BeverageBuilder setMilk(String milk) {
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
