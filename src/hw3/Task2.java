package hw3;

import java.util.Scanner;

public class Task2 {
    /*Пользователь вводит с клавиатуры три целочисленных значения.
   На экран выводится информация можно ли из этих сторон
   построить треугольник. (необходимо вспомнить правило построения треугольника по трем сторонам).*/
    public static void main(String[] args) {
        Scanner scannerForTask2 = new Scanner(System.in);
        System.out.println("Insert some number:");
        int a = scannerForTask2.nextInt();
        int b = scannerForTask2.nextInt();
        int c = scannerForTask2.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle exist.");
        } else {
            System.out.println("Triangle doesn`t exist.");
        }
        scannerForTask2.close();
    }
}
