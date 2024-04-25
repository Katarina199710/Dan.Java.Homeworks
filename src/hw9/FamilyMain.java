package hw9;

public class FamilyMain {
    public static void main(String[] args) {
        Pet pet = new Pet("cat","Kosha", 4, 60,new String[]{"eat, sleep, play"});
        pet.eat();
        pet.respond();
        pet.foul();
        Human mother = new Human("Kate", "Kolomiets", 1997);
        Human father = new Human("Andrey", "Kononenko", 2001);
        Family family = new Family(mother, father);
        System.out.println(family);
        mother.greetPet(pet);
        mother.describePet(pet);
        family.addChild(new Human("Kira", "Kononenko", 2025));
        family.deleteChild(1);
    }
}
