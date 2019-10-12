package lt.tomasdutkus.coffeemachine;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Write how many cups you will need: ");
        calcIngredients(scanner.nextInt());

    }

    private static void calcIngredients(int input) {
        System.out.println("For " + input + " cups of coffee you will need:\n" +
                input * 200 + " ml of water\n" +
                input * 50 + " ml of milk\n" +
                input * 15 + " g of coffee beans");

    }
}
