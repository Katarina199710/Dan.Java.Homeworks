package hw3;

import java.util.Scanner;

public class Task1 {
    /* У вас есть строка "Я тестирую замечательно. Что еще нужно?", которую нужно ввести с клавиатуры в консоль.
   Необходимо при помощи только метода next() класса Scanner (не используем метод nextLine()) присвоить переменным
   типа String следующие значения:
   string1 = Я
           string2 = тестирую
   string3 = замечательно
           string4 = Что еще нужно?
   Помимо string1, string2, string3, string4 новых переменных
   создавать нельзя.*/
    public static void main(String[] args) {
        Scanner scannerForHW3 = new Scanner(System.in);
        System.out.println("Insert text:");
        String string1 = scannerForHW3.next();
        String string2 = scannerForHW3.next();
        String string3 = scannerForHW3.next();
        String string4 = scannerForHW3.next() + " " + scannerForHW3.next() + " " + scannerForHW3.next();
        System.out.println(string1 + " " + string2 + " " + string3 + " " + string4);
        scannerForHW3.close();
    }
}
// Тут не поняла как сделать чтобы оно не обрезало последнюю фразу, которую мы вводим