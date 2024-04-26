package hw9;

public class FamilyMain {
    public static void main(String[] args) {
        Pet pet = new Pet("cat","Kosha", 4, 60,new String[]{"eat, sleep, play"});
        pet.eat();
        pet.respond();
        pet.foul();
        Human mother = new Human("Ginny Molly", "Weasley", 1981);
        Human father = new Human("Harry James", "Potter", 1980);
        Family family = new Family(mother, father);
        System.out.println(family);
        mother.greetPet(pet);
        mother.describePet(pet);
        family.addChild(new Human("Lily Luna", "Potter", 2007));
        family.addChild(new Human("Albus Severus", "Potter", 2006));
        family.addChild(new Human("James Sirius", "Potter", 2003));
        family.deleteChild(1);

    }
}
