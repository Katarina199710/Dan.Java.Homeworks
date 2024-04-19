package hw9;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;
   /* • привітати свого улюбленця (greetPet)("Привіт, [ім'я тварини]")
      • описати свого улюбленця (describePet): (вивести на екран всю інформацію про свого вихованця:
        "У мене є [вид тварини], їй [вік тварини] років, він [дуже хитрий]/[майже не хитрий]".
        Опис хитрості повинен залежати від рівня хитрості вихованця, якщо понад 50 -[дуже хитрий],
        якщо менше або дорівнює 50 -[майже не хитрий])*/

    public void greetPet(){
        System.out.println("Hello, " + pet.getNickname());
    }
    public void describePet(){
    }
   /* • Клас Human повинен виводити повідомлення наступного виду:
        Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone,
        father=Vito Karleone, pet=dog{nickname=' Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}*/

    public Human(){

    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }
}
