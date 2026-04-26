package org.example;

public interface Beverage {
    String getName();
    String getDescription();
    String getSize();
    String getMilk();
    String getSweetener();
    int getShots();
    boolean isHot();
}

enum Size {
    SMALL, MEDIUM, LARGE
}

enum Milk {
    WHOLE, SKIM, ALMOND, MILK, SOY
}

enum Sweetener {
    SUGAR, HONEY, STEVIA, NONE
}