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
        System.out.println("Enter your line number from 1 to 5");
        int number1 = scanner.nextInt();
        System.out.println("Enter your column number from 1 to 5");
        int number2 = scanner.nextInt();
//        int number1 = 0;
//        int number2 = 0;
        while (random1!=number1 && random2!=number2) {
//            int number1 = scanner.nextInt();
            if (number1 >= 1 && number1 <= 5) {
                System.out.println("Enter your column number from 1 to 5");
                number2 = scanner.nextInt();
            } else if (number2 >= 1 && number2 <= 5){
                System.out.println("Enter your number again");
                number1 = scanner.nextInt();
            }
            if (number2 >= 1 && number2 <= 5) {
                for (int i = 0; i < field.length; i++) {
                    System.out.print("[");
                    for (int a = 0; a < field[i].length; a++) {
                        System.out.print(field[i][a] + ", ");
                    }
                    System.out.print("\b] ");
                    System.out.println();
                }
            } else {
                System.out.println("Enter your number again");
                number2 = scanner.nextInt();
            }
//            for (int i = 0; i < field.length; i++) {
//                System.out.print("[");
//                for (int a = 0; a < field[i].length; a++) {
//                    System.out.print(field[i][a] + ", ");
//                }
//                System.out.print("\b] ");
//                System.out.println();
//            }
        }
    }
}
