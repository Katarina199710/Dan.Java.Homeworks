package hw3;

import java.util.Scanner;

public class Task5 {
    /*    Написать программу, используя тернарный оператор, где пользователь вводит с клавиатуры два числа и
    символ - или + или % или / или *. На экран выводится результат действия над двумя введенными числами.
    Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        String char1 = scanner.next();

        double result = char1.equals("-") ? num1 - num2 :
                char1.equals("+") ? num1 + num2 :
                        char1.equals("%") ? num1 % num2 :
                                char1.equals("/") ? num1 / num2 :
                                        char1.equals("*") ? num1 * num2 : 0;
        System.out.println(result);

    }
}
