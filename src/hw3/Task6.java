package hw3;

import java.util.Scanner;

public class Task6 {
    /* Используя оператор switch написать программу, которая выводит на консоль ссылку для скачивания программы.
     Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять: Linux, macOS, Windows.
     Программа должна спросить пользователя какая программа ему интересна, также спросить какую ОС он использует,
     а после вывести в консоль необходимую ссылку. Если программа с таким названием не существует, выводит сообщение
     в консоль, о том что такой программы не существует. Если указанной пользователем ОС нет, то выводится сообщение
     в консоль, о том что такой ОС не существует.*/




    // Я не знала можно ли вставлять сюда реальные ссылки, поэтому сделала свой вариант выводов

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What program are you interested in?");
        String program = scanner.nextLine();
        switch (program) {
            case ("IntelliJ IDEA"):
            case ("Git"):
            case ("Java"):
                System.out.println("What OS are you using?");
                break;
            default:
                System.out.println("No such program exists");
                break;
        }
        String os = scanner.nextLine();
        switch (os){
            case ("Linux"):
                System.out.println("Good Luck!");
                break;
            case ("macOS"):
                System.out.println("Doubtful but ok");
                break;
            case ("Windows"):
                System.out.println("Good choice!");
                break;
            default:
                System.out.println("No such OS exists");
                break;

        }
    }
}
