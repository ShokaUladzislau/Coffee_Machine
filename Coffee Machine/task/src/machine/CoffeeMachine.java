package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mlOfWater;
        int mlOfMilk;
        int gramsOfCoffee;
        int cups;
        int money;

        int[] ingredients = new int[] {mlOfWater = 400, mlOfMilk = 540, gramsOfCoffee = 120, cups = 9, money = 550};

        choiceAction(ingredients);

    }

    public static void choiceAction(int[] ingredients) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        while (action != "exit") {
            switch (action) {
                case "buy":
                    buy(ingredients);
                    choiceAction(ingredients);
                    break;
                case "fill":
                    fill(ingredients);
                    choiceAction(ingredients);
                    break;
                case "take":
                    take(ingredients);
                    choiceAction(ingredients);
                    break;
                case "remaining":
                    remaining(ingredients);
                    choiceAction(ingredients);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong !");
                    choiceAction(ingredients);
                    break;
            }
        }
    }
    public static void remaining(int[] ingredients) {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups\n" +
                "$%d of money \n\n", ingredients[0], ingredients[1], ingredients[2], ingredients[3], ingredients[4]);
    }
    public static void buy (int[] ingredients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String coffeeType = scanner.next();
        switch (coffeeType) {
            case "1":
                espresso(ingredients);
                break;
            case "2":
                latte(ingredients);
                break;
            case "3":
                cappuccino(ingredients);
                break;
            default:
                System.out.println("Wrong answer");
        }
    }
    public static int[] espresso(int[] ingredients) {
        int mlOfWaterForEspresso = 250;
        int mlOfMilkForEspresso = 0;
        int gramsOfCoffeeForEspresso = 16;
        int cup = 1;
        int price = 4;

        if (ingredients[0] >= mlOfWaterForEspresso
                && ingredients[1] >= mlOfMilkForEspresso
                && ingredients[2] >= gramsOfCoffeeForEspresso
                && ingredients[3] >= cup) {
            System.out.println("I have enough resources, making you a coffee!");

            ingredients[0] -= mlOfWaterForEspresso;
            ingredients[1] -= mlOfMilkForEspresso;
            ingredients[2] -= gramsOfCoffeeForEspresso;
            ingredients[3] -= cup;
            ingredients[4] += price;
            return ingredients;

        } else if (ingredients[0] < mlOfWaterForEspresso){
            System.out.println("Sorry, not enough water!");
        } else if (ingredients[1] < mlOfMilkForEspresso){
            System.out.println("Sorry, not enough milk!");
        } else if (ingredients[2] < gramsOfCoffeeForEspresso){
            System.out.println("Sorry, not enough coffee!");
        } else if (ingredients[3] < cup) {
            System.out.println("Sorry, not enough cups!");
        }

        return ingredients;
    }
    public static int[] latte(int[] ingredients) {
        int mlOfWaterForLatte = 350;
        int mlOfMilkForLatte = 75;
        int gramsOfCoffeeForLatte = 20;
        int cup = 1;
        int price = 7;

        if (ingredients[0] >= mlOfWaterForLatte
                && ingredients[1] >= mlOfMilkForLatte
                && ingredients[2] >= gramsOfCoffeeForLatte
                && ingredients[3] >= cup) {
            System.out.println("I have enough resources, making you a coffee!");

            ingredients[0] -= mlOfWaterForLatte;
            ingredients[1] -= mlOfMilkForLatte;
            ingredients[2] -= gramsOfCoffeeForLatte;
            ingredients[3] -= cup;
            ingredients[4] += price;
            return ingredients;

        } else if (ingredients[0] < mlOfWaterForLatte){
            System.out.println("Sorry, not enough water!");
        } else if (ingredients[1] < mlOfMilkForLatte){
            System.out.println("Sorry, not enough milk!");
        } else if (ingredients[2] < gramsOfCoffeeForLatte){
            System.out.println("Sorry, not enough coffee!");
        } else if (ingredients[3] < cup) {
            System.out.println("Sorry, not enough cups!");
        }

        return ingredients;
    }
    public static int[] cappuccino(int[] ingredients) {

        int mlOfWaterForCappuccino = 200;
        int mlOfMilkForCappuccino = 100;
        int gramsOfCoffeeForCappuccino = 12;
        int cup = 1;
        int price = 6;

        if (ingredients[0] >= mlOfWaterForCappuccino
                && ingredients[1] >= mlOfMilkForCappuccino
                && ingredients[2] >= gramsOfCoffeeForCappuccino
                && ingredients[3] >= cup) {
            System.out.println("I have enough resources, making you a coffee!");

            ingredients[0] -= mlOfWaterForCappuccino;
            ingredients[1] -= mlOfMilkForCappuccino;
            ingredients[2] -= gramsOfCoffeeForCappuccino;
            ingredients[3] -= cup;
            ingredients[4] += price;
            return ingredients;

        } else if (ingredients[0] < mlOfWaterForCappuccino){
            System.out.println("Sorry, not enough water!");
        } else if (ingredients[1] < mlOfMilkForCappuccino){
            System.out.println("Sorry, not enough milk!");
        } else if (ingredients[2] < gramsOfCoffeeForCappuccino){
            System.out.println("Sorry, not enough coffee!");
        } else if (ingredients[3] < cup) {
            System.out.println("Sorry, not enough cups!");
        }

        return ingredients;
    }
    public static int[] fill (int[] ingredients) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add: ");
        int mlOfWaterForFill = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int mlOfMilkForFill = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int gramsOfCoffeeForFill= scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cupsForFill = scanner.nextInt();

        ingredients[0] += mlOfWaterForFill;
        ingredients[1] += mlOfMilkForFill;
        ingredients[2] += gramsOfCoffeeForFill;
        ingredients[3] += cupsForFill;

        return ingredients;
    }
    public static int[] take (int[] ingredients) {

        System.out.printf("I gave you $%d",ingredients[4]);
        ingredients[4] -= ingredients[4];
        return ingredients;
    }
}