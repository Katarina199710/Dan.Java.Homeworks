package hw4;

import java.util.Scanner;

public class Task2 {
    /*Написать программу в которой пользователь вводит с клавиатуры число,
    а программа определяет, является она палиндромом или нет.
    И выводит данную информацию на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String numberString = String.valueOf(number);
        StringBuilder builder = new StringBuilder(numberString);
        String revert = String.valueOf(builder.reverse());
        if(revert.equals(numberString)){
            System.out.println("Number " + number + " is palindrome");
        }else {
            System.out.println("Number " + number + " is not palindrome");
        }
    }
}
