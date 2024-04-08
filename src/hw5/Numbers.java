package hw5;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Random randomObject = new Random();
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomObject.nextInt(0, 99);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let the game begin!");
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your number");
        int number = scanner.nextInt();

        int i = 0;
        while (i != array[i]) {
            if (number < array[i]){
                System.out.println("Your number is too small. Please, try again.");
            }
            number = scanner.nextInt();
            if (number > array[i]){
                System.out.println("Your number is too big. Please, try again.");
            }
            number = scanner.nextInt();
            if (number == array[i]){
//                String result = "Congratulations, {name}!";
//                System.out.println(result.replace("{name}", name));
            }
            String result = "Congratulations, {name}!";
            System.out.println(result.replace("{name}", name));
        }
    }
}
