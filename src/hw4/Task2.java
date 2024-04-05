package hw4;

import java.util.Scanner;

public class Task2 {
    /*Написать программу в которой пользователь вводит с клавиатуры число,
    а программа определяет, является она палиндромом или нет.
    И выводит данную информацию на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some number");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("0");
        }
        int left = 0;
        int right = 0;

        while (number > 0) {
            right = number % 10;
            left = 10 * left + right;
            if (right == left) {
                System.out.println("Your number is a palindrome");
            }
            if (right != left){
                System.out.println("Your number isn`t a palindrome");
            }
            number /= 10;
        }
    }
}
// Не понимаю как сделать чтобы не выводился первый вывод. И почему у меня в принципе вывод вылазит не один раз