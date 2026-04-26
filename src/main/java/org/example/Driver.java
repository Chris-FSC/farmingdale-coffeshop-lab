package org.example;

public class Driver {
    static void main() {
        Beverage testTea = new BeverageBuilder("tea", Size.MEDIUM)
                .updateSweetener(Sweetener.HONEY)
                .updateIsHot(false)
                .build();
        System.out.println(testTea.getDescription());

        Beverage testCoffee = new BeverageBuilder("coffee", Size.LARGE)
                .updateMilk(Milk.ALMOND)
                .updateSweetener(Sweetener.STEVIA)
                .updateIsHot(true)
                .build();
        System.out.println(testCoffee.getDescription());

        Order[] orders = new Order[5];
        orders[0] = new Order(1, testTea);
        orders[1] = new Order(2, testCoffee);
        orders[2] = new Order(3, new Cappuccino(Size.SMALL, Milk.WHOLE, Sweetener.SUGAR, 2));
        orders[3] = new Order(4, new Cappuccino(Size.LARGE, Milk.SOY, Sweetener.HONEY, 1));
        orders[4] = new Order(5, new Cappuccino(Size.MEDIUM, Milk.ALMOND, Sweetener.STEVIA, 3));

        System.out.println("\nOrders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
