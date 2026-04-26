package org.example;

public class Order {
    private int orderNumber;
    private Beverage beverage;

    public Order(int orderNumber, Beverage beverage) {
        this.orderNumber = orderNumber;
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return String.format("Order #%d: %s", orderNumber, beverage.getDescription());
    }
}
