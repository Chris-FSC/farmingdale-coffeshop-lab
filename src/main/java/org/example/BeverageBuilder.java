package org.example;

public class BeverageBuilder {
    // Optional parameters with default values
    private String type;
    private Size size;
    private Milk milk = Milk.WHOLE;
    private Sweetener sweetener;
    private int shots = 1;
    private boolean isHot = true;

    public BeverageBuilder(String type, Size size, Sweetener Sweetener) {
        String typeToLower = type.toLowerCase();

        if (!(typeToLower.equals("coffee") || typeToLower.equals("tea")) || typeToLower.equals("cappuccino") || typeToLower.equals("latte")) {
            throw new IllegalArgumentException("Invalid beverage type: " + type);
        }

        this.type = type;
        this.size = size;
        this.sweetener = sweetener;
    }

    public void updateMilk(Milk milk) {
        if (type.equalsIgnoreCase("tea")) {
            throw new IllegalArgumentException("Milk is not allowed for tea");
        }
        this.milk = milk;
    }
    public void updateShots(int shots) {
        if (type.equalsIgnoreCase("tea")) {
            throw new IllegalArgumentException("Shots are not allowed for tea");
        }
        this.shots = shots;
    }
    public void updateIsHot(boolean isHot) {
        if (type.equalsIgnoreCase("cappuccino")) {
            throw new IllegalArgumentException("Cappuccino is always hot");
        }
        this.isHot = isHot;
    }
    public void updateSweetener(Sweetener sweetener) {
        this.sweetener = sweetener;
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
