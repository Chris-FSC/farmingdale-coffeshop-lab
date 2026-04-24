package org.example;

public abstract class BeverageBuilder {
   protected Beverage beverage;
    public abstract BeverageBuilder setSize(String size);
    public abstract BeverageBuilder setMilk(String milk);
    public abstract BeverageBuilder setSweetener(String sweetener);
    public abstract BeverageBuilder setShots(int shots);
    public abstract BeverageBuilder setHot(boolean isHot);

    public Beverage build() {
        return beverage;
    }
}
