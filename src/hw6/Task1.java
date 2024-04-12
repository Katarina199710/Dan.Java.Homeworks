package hw6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    /* 1) Користувач визначає розмірність двовимірного масиву з клавіатури.
    Масив заповнюється випадковими числами від 0 до 1000.
    Необхідно створити одновимірний масив, що складається з максимальних значень
    кожного окремого масиву, що входить у двовимірний.
    Новий отриманий масив вивести на екран.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter first number:");
        int a = scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        int[][] input = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                input[i][j] = random.nextInt(0, 1001);
            }
        }
        System.out.println(Arrays.deepToString(input));
        int[] maximum = new int[a];
        for (int i = 0; i < a; i++){
            maximum[i] = input[i][0];
            for(int j = 0; j < b; j++){
                if(maximum[i]<input[i][j]){
                    maximum[i]=input[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(maximum));

    }
}
