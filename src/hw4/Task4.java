package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /* Первый будет состоять из следующих имен:
            "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
    Второй будет содержать следующие значения типа int:
            10, 12, 14, 16, 18, 20.
    Третий будет содержать следующие значения:
            "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
    Пользователь вводит три числа с клавиатуры, которые будут соответствовать
    индексам каждого из элементов массивов.
    Пример1. После ввода 3,2,1:
    На экране должно вывестись следующее сообщение:
            "Федя будет идти в магазин в 14:00"
    Пример2. После ввода 1,2,3:
    На экране должно вывестись следующее сообщение:
            "Маша будет идти в тренажерный зал в 14:00"
*/
    public static void main(String[] args) {
        String[] nameArray = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        int[] timeArray = {10, 12, 14, 16, 18, 20};
        String[] placeArray = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Index of your name from 0 till 6:");
        String result = "{NAME} будет идти в {PLACE} в {TIME}:00";
//       String numbers = scanner.nextLine();
//       int index1 = Integer.parseInt(numbers);
        int indexOfName = scanner.nextInt();
        while (indexOfName < 0 || indexOfName > 6) {
            System.out.println("Insert Index of your name from 0 till 6:");
            indexOfName = scanner.nextInt();
        }
        System.out.println("Insert Index of your place from 0 till 5:");
        int indexOfPlace = scanner.nextInt();
        while (indexOfPlace < 0 || indexOfPlace > 5) {
            System.out.println("Insert Index of your place from 0 till 5:");
            indexOfPlace = scanner.nextInt();
        }
        System.out.println("Insert Index of your time from 0 till 5:");
        int indexOfTime = scanner.nextInt();
        while (indexOfTime < 0 || indexOfTime > 5) {
            System.out.println("Insert Index of your time from 0 till 5:");
            indexOfTime = scanner.nextInt();
        }
        String time = Integer.toString(indexOfTime);
        System.out.println(result.replace("{NAME}", nameArray[indexOfName])
                .replace("{PLACE}", placeArray[indexOfPlace]).replace("{TIME}", time));
    }
}
