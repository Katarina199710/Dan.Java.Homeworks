package hw10.task2;

import java.util.Random;
import java.util.Scanner;

public class ArrayProcessor {
    public static double processArray() throws InvalidIndexException, DivideByZeroException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = random.nextInt(30) + 1;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(31);
        }
        System.out.print("Enter an index (0 to " + (size - 1) + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }
        if (array[0] == 0) {
            throw new DivideByZeroException("First element is zero, division by zero");
        }
        return (double) array[index] / array[0];
    }
}
