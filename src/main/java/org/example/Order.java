package org.example;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderType;
    private List<Beverage> beverages;

    public Order(String orderType) {
        this.orderType = orderType;
        this.beverages = new ArrayList<>();
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public void printReceipt() {
        System.out.println("--- Ram's Brew Order (" + orderType + ") ---");
        double total = 0;
        for (Beverage b : beverages) {
            System.out.println(b.getName() + " [" + b.getSize() + "]: " + 
                               b.getMilk() + " milk, " + b.getShots() + " shots, " + 
                               b.getSweetener() + " - $" + b.getCost());
            total += b.getCost();
        }
        System.out.println("Total: $" + total);
        System.out.println("------------------------------------------");
    }
}
