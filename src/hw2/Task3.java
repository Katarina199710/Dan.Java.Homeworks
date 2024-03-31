package hw2;

public class Task3 {
    /* При применении к массиву строк поля length, можно узнать сколько элементов находится в массиве.
       Тоесть если у Вас есть массив строк типа: String[] arrayOfString;
       то при вызове поля lenth:
       int size = arrayOfString.length;
       можно получить какое количество символов находится в данном массиве.

       Попробовать, используя метод split и информацию по поводу поля length, вывести на экран какое количество раз
       символ 'a' встречается в  строке:
       "Completely random text in English. In it,
       we just need to determine how many times the character 'a' occurs there.
       And we can use the split method and the length method."

       Решить данную задачу с учетом верхнего и нижнего регистра символа 'a'. */
    public static void main(String[] args) {
        String text = "Completely random text in English. In it,\n" +
                "       we just need to determine how many times the character 'a' occurs there.\n" +
                "       And we can use the split method and the length method.";
        String[] textArray = text.split("A");
        System.out.println(textArray.length-1);
        String[] textArray1 = text.split("a");
        System.out.println(textArray1.length-1);
    }
}
