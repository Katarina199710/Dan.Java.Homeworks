package hw4;

import java.util.Scanner;

public class Task1 {
    /* Написать программу, которая будет считывать введенные пользователем
   слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
   пока пользователь не введет с клавиатуры слово STOP.
   Все слова введенные до этого должны отобразится в консоли
   одним предложением.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some word");
        String word = scanner.next();

        while (!word.equals("STOP")){
            System.out.print(word + " ");
            word = scanner.next();
        }
    }
}
// Не пойму как сделать как чтобы выводились все введенные слова в целое предложение