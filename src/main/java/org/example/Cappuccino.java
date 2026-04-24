package org.example;

public class Cappuccino extends AbstractBeverage {


    public Cappuccino() {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setMilk(String milk) {
        this.milk = milk;
    }
    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
    public void setShots(int shots) {
        this.shots = shots;
    }
    public void setHot(boolean isHot) {
        this.isHot = isHot;
    }

}