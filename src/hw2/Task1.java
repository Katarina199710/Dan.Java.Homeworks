package hw2;

public class Task1 {
    /* Создать переменную string1 = "This line that i want to cut, cause it is too long".
       Создать строку string2 в которой должно быть помещено значение строки string1,
       Обрезанное до "This line that i want to cut, cause".
       Создать строку string3 на основе string2 которое будет содержать значение
       "This line that don't want to cut, cause it is perfect".
       Вывести на консоль каждое сообщение и его длину.*/

    public static void main(String[] args) {
        String string1 = "This line that i want to cut, cause it is too long";
        System.out.println(string1.length());
        System.out.println(string1);
        String string2;
        string2 = string1.substring(0,string1.length()-15);
        System.out.println(string2);
        System.out.println(string2.length());
        String string3;
        string3 = string2.substring(0,string2.length()-20).concat("don't want to cut, cause it is perfect");
        System.out.println(string3);
        System.out.println(string3.length());

    }
}
