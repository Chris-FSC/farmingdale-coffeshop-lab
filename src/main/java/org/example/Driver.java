package org.example;

public class Driver {
    static void main() {
        Tea testTea = (Tea) new BeverageBuilder("tea", Size.MEDIUM)
                .updateSweetener(Sweetener.HONEY)
                .updateIsHot(false)
                .build();
        System.out.println(testTea.getDescription());

        Coffee testCoffee = (Coffee) new BeverageBuilder("coffee", Size.LARGE)
                .updateMilk(Milk.ALMOND)
                .updateSweetener(Sweetener.STEVIA)
                .updateIsHot(true)
                .build();
        System.out.println(testCoffee.getDescription());
    }
}
