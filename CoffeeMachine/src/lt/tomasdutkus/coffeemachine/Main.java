package lt.tomasdutkus.coffeemachine;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoffeeMachine myCoffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);

        CoffeeMachine.showMenu(myCoffeeMachine);
        coffeeMachineMenu(myCoffeeMachine);

 /*       System.out.println("Write how many cups you will need: ");
        calcIngredients(scanner.nextInt());
        System.out.println("Write how many ml of water the coffee machine has: ");
        makeCoffee(); */

    }

 /*   private static void calcIngredients(int input) {
        System.out.println("For " + input + " cups of coffee you will need:\n" +
                input * 200 + " ml of water\n" +
                input * 50 + " ml of milk\n" +
                input * 15 + " g of coffee beans");
    }

    private static void makeCoffee() {
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        int additional = Math.min((water / 200), Math.min((milk / 50), (beans / 15)) - cups);
        boolean addition = additional >= 1;
        boolean can = additional >= 0;
        int cant = Math.min((water / 200), Math.min((milk / 50), (beans / 15)));

        if (addition)
            System.out.println("Yes, I can make that amount of coffee (and even " + additional + " more than that)");
        else if (can) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (!can) {
            System.out.println("No, I can make only " + cant + " cup(s) of coffee");
        }
    } */

    private static void coffeeMenu(CoffeeMachine myCoffeeMachine, String choice) {
        switch (choice) {
            case "1":
                if (myCoffeeMachine.getWater() >= 250 && myCoffeeMachine.getCoffeeBeans() >= 16) {
                    myCoffeeMachine.setWater(myCoffeeMachine.getWater() - 250);
                    myCoffeeMachine.setCoffeeBeans(myCoffeeMachine.getCoffeeBeans() - 16);
                    myCoffeeMachine.setDisposableCups(myCoffeeMachine.getDisposableCups() - 1);
                    myCoffeeMachine.setMoney(myCoffeeMachine.getMoney() + 4);
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getWater() < 250) {
                    System.out.println("Sorry, not enough water!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getCoffeeBeans() < 16) {
                    System.out.println("Sorry, not enough beans!");
                    coffeeMachineMenu(myCoffeeMachine);
                }
                break;
            case "2":
                if (myCoffeeMachine.getWater() >= 350 && myCoffeeMachine.getMilk() >= 75 && myCoffeeMachine.getCoffeeBeans() >= 20) {
                    myCoffeeMachine.setWater(myCoffeeMachine.getWater() - 350);
                    myCoffeeMachine.setMilk(myCoffeeMachine.getMilk() - 75);
                    myCoffeeMachine.setCoffeeBeans(myCoffeeMachine.getCoffeeBeans() - 20);
                    myCoffeeMachine.setDisposableCups(myCoffeeMachine.getDisposableCups() - 1);
                    myCoffeeMachine.setMoney(myCoffeeMachine.getMoney() + 7);
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getWater() < 350) {
                    System.out.println("Sorry, not enough water!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getMilk() < 75) {
                    System.out.println("Sorry, not enough milk!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getCoffeeBeans() < 20) {
                    System.out.println("Sorry, not enough beans!");
                    coffeeMachineMenu(myCoffeeMachine);
                }
                break;
            case "3":
                if (myCoffeeMachine.getWater() >= 200 && myCoffeeMachine.getMilk() >= 100 && myCoffeeMachine.getCoffeeBeans() >= 12) {
                    myCoffeeMachine.setWater(myCoffeeMachine.getWater() - 200);
                    myCoffeeMachine.setMilk(myCoffeeMachine.getMilk() - 100);
                    myCoffeeMachine.setCoffeeBeans(myCoffeeMachine.getCoffeeBeans() - 12);
                    myCoffeeMachine.setDisposableCups(myCoffeeMachine.getDisposableCups() - 1);
                    myCoffeeMachine.setMoney(myCoffeeMachine.getMoney() + 6);
                    System.out.println("I have enough resources, making you a coffee!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getWater() < 200) {
                    System.out.println("Sorry, not enough water!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getMilk() < 100) {
                    System.out.println("Sorry, not enough milk!");
                    coffeeMachineMenu(myCoffeeMachine);
                } else if (myCoffeeMachine.getCoffeeBeans() < 12) {
                    System.out.println("Sorry, not enough beans!");
                    coffeeMachineMenu(myCoffeeMachine);
                }
                break;
            case "back":
                coffeeMachineMenu(myCoffeeMachine);
                break;
            default:
                System.out.println("Invalid input");
                coffeeMachineMenu(myCoffeeMachine);
                break;
        }
    }

    private static void coffeeMachineMenu(CoffeeMachine myCoffeeMachine) {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        switch (scanner.next()) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappucino, back - to main menu: ");
                coffeeMenu(myCoffeeMachine, scanner.next());
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                int water = scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add: ");
                int milk = scanner.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int beans = scanner.nextInt();
                System.out.println("write how many disposable cups of coffee do you want to add: ");
                int cups = scanner.nextInt();
                myCoffeeMachine.setWater(myCoffeeMachine.getWater() + water);
                myCoffeeMachine.setMilk(myCoffeeMachine.getMilk() + milk);
                myCoffeeMachine.setCoffeeBeans(myCoffeeMachine.getCoffeeBeans() + beans);
                myCoffeeMachine.setDisposableCups(myCoffeeMachine.getDisposableCups() + cups);
                coffeeMachineMenu(myCoffeeMachine);
                break;
            case "take":
                int money = myCoffeeMachine.getMoney();
                myCoffeeMachine.setMoney(0);
                System.out.println("\nI gave you $" + money + "\n");
                coffeeMachineMenu(myCoffeeMachine);
                break;
            case "remaining":
                myCoffeeMachine.showMenu(myCoffeeMachine);
                coffeeMachineMenu(myCoffeeMachine);
                break;
            case "exit":
                break;
            default:
                System.out.println("Invalid input");
                coffeeMachineMenu(myCoffeeMachine);
                break;
        }
    }
}

