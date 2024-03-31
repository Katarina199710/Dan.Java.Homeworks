package hw2;

public class Task2 {
    /*  Создать строку string = "Testing, is my favourite job".
        Вывести на экран отдельно каждое слово и длину этого слова в след виде:
        Cлово1 = (значение слова), Длина этого слова = (значение длины слов).
        Cлово2 = (значение слова), Длина этого слова = (значение длины слов).
        и т.д.
        Вывести на консоль true, если первое слово длиннее остальных, в противном случае вывести false. */

    public static void main(String[] args) {
        String string = "Testing, is my favourite job";
        String[] wordsArray = string.split(" ");
        System.out.println(wordsArray[0] + " " + wordsArray[0].length());
        System.out.println(wordsArray[1] + " " + wordsArray[1].length());
        System.out.println(wordsArray[2] + " " + wordsArray[2].length());
        System.out.println(wordsArray[3] + " " + wordsArray[3].length());
        System.out.println(wordsArray[4] + " " + wordsArray[4].length());
        boolean result1 = wordsArray[0].length() >= wordsArray[1].length();
        System.out.println(result1);
        boolean result2 = wordsArray[0].length() >= wordsArray[2].length();
        System.out.println(result2);
        boolean result3 = wordsArray[0].length() >= wordsArray[3].length();
        System.out.println(result3);
        boolean result4 = wordsArray[0].length() >= wordsArray[4].length();
        System.out.println(result4);
    }
}
