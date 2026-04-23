package org.example;

public interface Beverage {
    String getName();
    String getDescription();
    double getCost(); //I'll ask but I don't know if this is required
    String getSize();
    String getMilk();
    String getSweetener();
    int getShots();
    boolean isHot();
}