package hw7;

public class Task2 {
    /* Написать перегруженный метод, который может:

      • Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
      • Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
      • Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
      • Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
      • Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
      "Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.
   */
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.methodForTask2();
        task2.methodForTask2("I`m text");
        task2.methodForTask2(new String[]{"My", "home", "is", "Ukraine"});
        task2.methodForTask2(new int[]{2, 3, 5, 15, 3, 5});
        task2.methodForTask2(5, "years old");
    }

    public void methodForTask2() {
        System.out.println("I`m empty(((");
    }

    public void methodForTask2(String text) {
        System.out.println(text);
    }

    public void methodForTask2(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void methodForTask2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }

    public void methodForTask2(int number, String text) {
        System.out.println("Your message - " + text + " , your number - " + number);
    }
}
