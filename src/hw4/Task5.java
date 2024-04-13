package hw4;

import java.util.Scanner;

public class Task5 {
    /* Есть одномерный массив из 10 элементов, заполненный случайными числами.
   Пользователь вводит с клавиатуры число.
   Программа показывает есть ли такое число в созданном до этого массиве.*/
    public static void main(String[] args) {
        int[] numbers = {2,5,3,6,7,8,9,1,0,11};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean a = false;
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                a = true;
            }
        }
        if (a){
            System.out.println("This number is present in this array");
        }else {
            System.out.println("This number is not present in this array");
        }
    }
}
