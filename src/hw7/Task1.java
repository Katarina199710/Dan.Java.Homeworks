package hw7;

public class Task1 {
    //    Написать метод, принимающий в качестве параметра массив целых чисел.
    //    И выводит на экран все четные числа списком, a также нечетные числа списком.
    public static void main(String[] args) {
        Task1 check = new Task1();
        check.printEvenAndOddNumbers(new int[]{12, 3, 4, 10, 8, 5, 9});
    }

    public void printEvenAndOddNumbers(int[] numbers) {
        System.out.println("Even numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {

                System.out.println(numbers[i]);
            }
        }
    }
}
