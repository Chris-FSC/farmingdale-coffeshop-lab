package org.example;

public class Tea extends AbstractBeverage {


    public Tea() {
        this.name = "Tea";
        this.description = "";
        this.cost = 3.00;
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