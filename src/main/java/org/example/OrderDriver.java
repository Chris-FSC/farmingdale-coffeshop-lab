package org.example;

import java.util.Scanner;

public class OrderDriver {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Order currentOrder = new Order("Walk-in");
        System.out.println("Welcome to Ram's Brew!");

        // 1. Select Beverage Type
        String type = getValidInput("Choose beverage (Coffee, Latte, Cappuccino, Tea): ", 
                                    new String[]{"coffee", "latte", "cappuccino", "tea"});

        BeverageBuilder builder;
        switch (type.toLowerCase()) {
            case "latte": builder = new LatteBuilder(); break;
            case "cappuccino": builder = new CappuccinoBuilder(); break;
            case "tea": builder = new TeaBuilder(); break;
            default: builder = new CoffeeBuilder();
        }

        // 2. Select Size (Using Enum Validation)
        String sizeChoice = getEnumInput("Enter size (Small, Medium, Large): ", Constants.Size.class);
        builder.setSize(sizeChoice);

        // 3. Select Milk
        String milkChoice = getEnumInput("Enter milk (Whole, Skim, Almond, Oat, Soy): ", Constants.Milk.class);
        builder.setMilk(milkChoice);

        // Finalize and Print
        currentOrder.addBeverage(builder.build());
        currentOrder.printReceipt();
    }

   
    private static <E extends Enum<E>> String getEnumInput(String prompt, Class<E> enumClass) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine().toUpperCase().trim();
                return Enum.valueOf(enumClass, input).toString(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid selection. Please choose from the options provided.");
            }
        }
    }

    
    private static String getValidInput(String prompt, String[] validOptions) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().toLowerCase().trim();
            for (String option : validOptions) {
                if (option.equals(input)) return input;
            }
            System.out.println("Invalid option. Try again.");
        }
    }
}
