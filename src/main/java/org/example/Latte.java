package org.example;

public class Latte extends AbstractBeverage {


    public Latte() {
        this.name = "Latte";
        this.description = "";
        this.cost = 5.00;
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