package hw3;

import java.util.Scanner;

public class Task3 {
    /* При помощи тернарного оператора необходимо получить разность двух чисел введенных с клавиатуры,
    и всегда отнимать от большего меньшее.
    Вывести эту разность в консоль.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number two");
        int numberTwo = scanner.nextInt();
        int result = numberOne - numberTwo;
        int result2 = numberOne > numberTwo ? result : numberTwo < numberOne ? numberTwo - numberOne : result;
        System.out.println(result2);
    }
}
