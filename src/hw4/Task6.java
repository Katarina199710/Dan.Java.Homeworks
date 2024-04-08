package hw4;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    /* Заполнить массив на 45 элементов случайными числами
    от -50 до +50. Найти минимальный элемент и вывести его
    на консоль. Найти максимальный элемент и вывести его на
    консоль.*/
    public static void main(String[] args) {
        Random randomObject = new Random();
        int[] array = new int[45];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomObject.nextInt(-50, 51);
        }

        int minimum = array[0];
        for(int i = 0; i < array.length; i++){
            if(minimum > array[i]){
                minimum = array[i];
            }
        }
        System.out.println(minimum);
        int maximum = array[44];
        for(int i = 0; i < array.length; i++){
            if(minimum < array[i]){
                minimum = array[i];
            }
        }
        System.out.println(maximum);

    }
}
