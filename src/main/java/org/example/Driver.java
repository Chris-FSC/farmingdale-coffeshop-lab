package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Driver {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Order> orderList = new ArrayList<>();
        int orderCounter = 1;

        System.out.println("Please build your beverage.");
        while (true) {
            try {
                System.out.print("\nEnter beverage (coffee, tea, latte, cappuccino) type 'ready' to finish: ");
                String type = scanner.nextLine().toLowerCase();
                if (type.equals("ready")) break;

                if (!(type.equals("coffee") || type.equals("tea") || type.equals("latte") || type.equals("cappuccino"))) {
                    throw new IllegalArgumentException("Invalid beverage type: " + type);
                }

                System.out.print("Enter size (SMALL, MEDIUM, LARGE): ");
                Size size = Size.valueOf(scanner.nextLine().toUpperCase());

                BeverageBuilder builder = new BeverageBuilder(type, size);

                if(!type.equals("tea")) {
                    System.out.print("Enter milk (WHOLE, SKIM, ALMOND, OAT, SOY, NO): ");
                    builder.updateMilk(Milk.valueOf(scanner.nextLine().toUpperCase()));
                } else {
                    System.out.println("Skipping Milk since milk is not allowed for tea. \n");
                }
                if (!type.equals("tea") && !type.equals("coffee")) {
                    System.out.print("How many shots? (0 - 3): ");
                    int shots = Integer.parseInt(scanner.nextLine());
                    builder.updateShots(shots);
                }

                System.out.print("Enter sweetener (SUGAR, HONEY, STEVIA, NONE): ");
                builder.updateSweetener(Sweetener.valueOf(scanner.nextLine().toUpperCase()));

                if (!type.equals("cappuccino")) {
                    System.out.print("Would you like it hot? (yes/no): ");
                    String hotInput = scanner.nextLine().trim().toLowerCase();
                    boolean hotBoolean = switch (hotInput) {
                        case "yes" -> true;
                        case "no" -> false;
                        default -> throw new IllegalArgumentException("Must answer 'yes or 'no' for temperature.");
                    };
                    builder.updateIsHot(hotBoolean);
                }

                Beverage drink = builder.build();
                orderList.add(new Order(orderCounter++, drink));
                System.out.println(">> Added: " + drink.getDescription());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: Invalid input. Please choose from the options. (" + e.getMessage() + ")");
            } catch (Exception e) {
                System.out.println("An error has occurred. Let's try again.");
            }
                }
        System.out.println("\n Total Order ");
        for (Order o : orderList) {
            System.out.println(o);
            }

        }
    }

