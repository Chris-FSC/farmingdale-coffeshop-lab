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

                System.out.print("Enter size (SMALL, MEDIUM, LARGE): ");
                Size size = Size.valueOf(scanner.nextLine().toUpperCase());

                BeverageBuilder builder = new BeverageBuilder(type, size);

                System.out.print("Enter milk (WHOLE, SKIM, ALMOND, OAT, SOY, NO): ");
                builder.updateMilk(Milk.valueOf(scanner.nextLine().toUpperCase()));

                if (!type.equals("tea") && !type.equals("coffee")) {
                    System.out.print("How many shots? ");
                    int shots = Integer.parseInt(scanner.nextLine());
                    builder.updateShots(shots);
                }

                System.out.print("Enter sweetener (SUGAR, HONEY, STEVIA, NONE): ");
                builder.updateSweetener(Sweetener.valueOf(scanner.nextLine().toUpperCase()));

                if (!type.equals("cappuccino")) {
                    System.out.print("Would you like it hot?(If not, drink is iced) (true/false): ");
                    builder.updateIsHot(Boolean.parseBoolean(scanner.nextLine()));
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

