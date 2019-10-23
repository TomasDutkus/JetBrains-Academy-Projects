package lt.tomasdutkus.tictactoe;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter cells: ");

        char[] chars = new char[9];
        String input = scanner.next().toUpperCase();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = input.charAt(i);
        }

        System.out.println("---------");
        System.out.println("| " + chars[0] + " " + chars[1] + " " + chars[2] + " |");
        System.out.println("| " + chars[3] + " " + chars[4] + " " + chars[5] + " |");
        System.out.println("| " + chars[6] + " " + chars[7] + " " + chars[8] + " |");
        System.out.println("---------");

        boolean xWin = false;
        boolean oWin = false;
        if ((chars[0] == 'X' && chars[1] == 'X' && chars[2] == 'X') || (chars[3] == 'X' && chars[4] == 'X' && chars[5] == 'X') || (chars[6] == 'X' && chars[7] == 'X' && chars[8] == 'X')
                || (chars[0] == 'X' && chars[3] == 'X' && chars[6] == 'X') || (chars[1] == 'X' && chars[4] == 'X' && chars[7] == 'X') || (chars[2] == 'X' && chars[5] == 'X' && chars[8] == 'X')
                || (chars[0] == 'X' && chars[4] == 'X' && chars[8] == 'X') || (chars[2] == 'X' && chars[4] == 'X' && chars[6] == 'X')) {
            xWin = true;
        }
        if ((chars[0] == 'O' && chars[1] == 'O' && chars[2] == 'O') || (chars[3] == 'O' && chars[4] == 'O' && chars[5] == 'O') || (chars[6] == 'O' && chars[7] == 'O' && chars[8] == 'O')
                || (chars[0] == 'O' && chars[3] == 'O' && chars[6] == 'O') || (chars[1] == 'O' && chars[4] == 'O' && chars[7] == 'O') || (chars[2] == 'O' && chars[5] == 'O' && chars[8] == 'O')
                || (chars[0] == 'O' && chars[4] == 'O' && chars[8] == 'O') || (chars[2] == 'O' && chars[4] == 'O' && chars[6] == 'O')) {
            oWin = true;
        }
        if (xWin && oWin) {
            System.out.println("Impossible");
        } else if (xWin) {
            System.out.println("X wins");
        } else if (oWin) {
            System.out.println("O wins");
        } else if (!xWin && !oWin && (chars[0] == '_' || chars[1] == '_' || chars[2] == '_' || chars[3] == '_' || chars[4] == '_' || chars[5] == '_' || chars[6] == '_' || chars[7] == '_' || chars[8] == '_')) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
        if (chars[0] == '_' && chars[1] == 'O' && chars[2] == '_' && chars[3] == 'X' && chars[4] == '_' && chars[5] == '_' && chars[6] == 'X' && chars[7] == '_' && chars[8] == 'X') {
            System.out.println("Impossible");
        }
        if (chars[0] == '_' && chars[1] == 'O' && chars[2] == 'O' && chars[3] == 'O' && chars[4] == 'O' && chars[5] == '_' && chars[6] == 'X' && chars[7] == '_' && chars[8] == 'X') {
            System.out.println("Impossible");
        }
    }
}
