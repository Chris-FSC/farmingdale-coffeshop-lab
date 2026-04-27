package org.example;

public class BeverageBuilder {
    // Optional parameters with default values
    private String type;
    private Size size;
    private Milk milk = Milk.WHOLE;
    private Sweetener sweetener = Sweetener.NONE;
    private int shots = 1;
    private boolean isHot = true;

    public BeverageBuilder(String type, Size size) {
        String typeToLower = type.toLowerCase();


        if (!(typeToLower.equals("coffee") || typeToLower.equals("tea") || typeToLower.equals("cappuccino")
                || typeToLower.equals("latte"))) {
            throw new IllegalArgumentException("Invalid beverage type: " + type);
        }

        this.type = type;
        this.size = size;

    }

    public BeverageBuilder updateMilk(Milk milk) {
        if (type.equalsIgnoreCase("tea")) {
            throw new IllegalArgumentException("Milk is not allowed for tea");
        }
        this.milk = milk;
        return this;
    }

    public BeverageBuilder updateShots(int shots) {
        if (type.equalsIgnoreCase("tea")) {
            throw new IllegalArgumentException("Shots are not allowed for tea");
        }
        if (shots < 0 || shots > 3) {
            throw new IllegalArgumentException("Shots must be between 0 and 3");
        }
        this.shots = shots;
        return this;
    }

    public BeverageBuilder updateIsHot(boolean isHot) {
        if (type.equalsIgnoreCase("cappuccino")) {
            throw new IllegalArgumentException("Cappuccino is always hot");
        }
        this.isHot = isHot;
        return this;
    }

    public BeverageBuilder updateSweetener(Sweetener sweetener) {
        this.sweetener = sweetener;
        return this;
    }

    public Beverage build() {
        return switch (type) {
            case "coffee" -> new Coffee(size, milk, sweetener, isHot);
            case "latte" -> new Latte(size, milk, sweetener, shots, isHot);
            case "tea" -> new Tea(size, sweetener, isHot);
            case "cappuccino" -> new Cappuccino(size, milk, sweetener, shots);
            default -> throw new IllegalArgumentException("Unsupported beverage type: " + type);
        };
    }
}
