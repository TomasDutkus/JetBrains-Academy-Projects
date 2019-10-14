package lt.tomasdutkus.coffeemachine;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Write how many cups you will need: ");
        calcIngredients(scanner.nextInt());
        System.out.println("Write how many ml of water the coffee machine has: ");
        makeCoffee();

    }

    private static void calcIngredients(int input) {
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

        int additional = Math.min((water / 200), Math.min((milk / 50), (beans / 15)) -cups);
        boolean addition = additional >= 1;
        boolean can = additional >= 0;
        int cant = Math.min((water / 200), Math.min((milk / 50), (beans / 15)));

        if (addition)
            System.out.println("Yes, I can make that amount of coffee (and even " + additional + " more than that)");
        else if (can) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if(!can) {
            System.out.println("No, I can make only " + cant + " cup(s) of coffee");
        }
    }
}
