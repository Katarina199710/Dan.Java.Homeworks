package hw3;

import java.util.Scanner;

public class Task1 {
    /* У вас есть строка "Я тестирую замечательно. Что еще нужно?", которую нужно ввести с клавиатуры в консоль.
   Необходимо при помощи только  метода next() класса Scanner (не используем метод nextLine()) присвоить переменным
   типа String следующие значения:
   string1 = Я
           string2 = тестирую
   string3 = замечательно
           string4 = Что еще нужно?
   Помимо string1, string2, string3, string4 новых переменных
   создавать нельзя.*/
    public static void main(String[] args) {
        Scanner scannerForHW3 = new Scanner(System.in);
        String string1 = "Я";
        String string2 = "тестирую";
        String string3 = "замечательно.";
        String string4 = "Что еще нужно?";
        System.out.println("Insert text:");
        System.out.println(scannerForHW3.next());
        System.out.println(scannerForHW3.next());
        System.out.println(scannerForHW3.next());
        System.out.println(scannerForHW3.next() + string4.replace("Что",""));
        scannerForHW3.close();
    }
}
