package hw4;

import java.util.Scanner;

public class Task3 {
    /*  Написать программу, условно для склада приема металла. Представим, что склад
    может хранить определенный вес металла. Пользователь вводит с
    клавиатуры вес, который может храниться на складе. Дальше пользователь вводит
    с клавиатуры вес, который условно собирается сдать на склад пользователь.
    Программа должна после каждой сдачи металла показывать сколько веса еще может принять
    склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
    то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
    Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
    о невозможности приемки такого малого веса. Программа завершается, когда
    место на складе закончилось.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max weight:");
        int maxWeight = scanner.nextInt();
        int incomeWeight = 0;
        while (incomeWeight <= maxWeight){
            System.out.println("Enter incoming weight:");
            int tampWeight = scanner.nextInt();
            if (incomeWeight + tampWeight > maxWeight){
                System.out.println("You have exceeded the limit");
                System.out.println("Space left for " + (maxWeight - incomeWeight) + " kilograms");
                continue;
            }
            incomeWeight = incomeWeight + tampWeight;
            if (incomeWeight == maxWeight){
                break;
            }
            System.out.println("Space left for " + (maxWeight - incomeWeight) + " kilograms");
        }
        System.out.println("You filled the whole space");
    }
}
