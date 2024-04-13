package hw6;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtATarget {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] field = new char[][]{{'0', '1', '2', '3', '4', '5'}, {'1', '-', '-', '-', '-', '-'},
                {'2', '-', '-', '-', '-', '-'}, {'3', '-', '-', '-', '-', '-'},
                {'4', '-', '-', '-', '-', '-'}, {'5', '-', '-', '-', '-', '-'}};

        int random1 = random.nextInt(1, 5);
        int random2 = random.nextInt(1, 5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("All Set. Get ready to rumble!");

        boolean c = true;
        while (c) {
            boolean b = true;
            System.out.println("Enter your line number from 1 to 5");
            int number1 = scanner.nextInt();
            while (b) {
                if (number1 >= 1 && number1 <= 5) {
                    b = false;
                } else {
                    System.out.println("Enter your number again");
                    number1 = scanner.nextInt();
                }
            }
            System.out.println("Enter your column number from 1 to 5");
            int number2 = scanner.nextInt();
            boolean b1 = true;
            while (b1) {
                if (number2 >= 1 && number2 <= 5) {
                    b1 = false;
                } else {
                    System.out.println("Enter your number again");
                    number2 = scanner.nextInt();
                }
            }
            if (random1 == number1 && random2 == number2) {
                field[number1][number2] = 'x';
                c = false;
            } else {
                field[number1][number2] = '*';
            }
            for (int i = 0; i < field.length; i++) {
                System.out.print("[");
                for (int a = 0; a < field[i].length; a++) {
                    System.out.print(field[i][a] + ", ");
                }
                System.out.print("\b] ");
                System.out.println();
            }
        }
    }
}
