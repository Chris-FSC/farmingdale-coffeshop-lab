package org.example;

public abstract class BeverageBuilder {
   protected Beverage beverage;
    public abstract BeverageBuilder setSize(String size) {
       beverage.setSize(size);
       return this;
    }
    public abstract BeverageBuilder setMilk(String milk) {
       beverage.setMilk(milk);
       return this;
    }
    public abstract BeverageBuilder setSweetener(String sweetener) {
       beverage.setSweetener(sweetener);
       return this;
    }
    public abstract BeverageBuilder setShots(int shots) {
       beverage.setShots(shots);
       return this;
    }
    public abstract BeverageBuilder setHot(boolean isHot) {
       beverage.setHot(isHot);
       return this;
    }

    public Beverage build() {
        return beverage;
    }
   
}
