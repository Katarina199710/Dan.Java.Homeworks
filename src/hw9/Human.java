package hw9;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq;
    private Family family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        if (iq >= 0 && iq <= 100) {
            this.iq = iq;
        } else {
            System.out.println("Enter your IQ level again");
        }
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname());
    }

    public void describePet(Pet pet) {
        if (pet.getTrickLevel() <= 50) {
            String text1 = "almost not tricky";
            System.out.println("I have a " + pet.getSpecies() + " , it`s " + pet.getAge() + " years old, it is "
                    + text1 + " .");
        } else {
            String text2 = "very tricky";
            System.out.println("I have a " + pet.getSpecies() + " , it`s " + pet.getAge() + " years old, it is "
                    + text2 + " .");
        }
    }

    public Human() {

    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        if (iq >= 0 && iq <= 100) {
            this.iq = iq;
        }
    }

    @Override
    public String toString() {
        return '\'' + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", yearOfBirth = " + yearOfBirth +
                ", iq = " + iq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearOfBirth == human.yearOfBirth && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearOfBirth);
    }
}
