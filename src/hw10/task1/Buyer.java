package hw10.task1;

public class Buyer {
    private String name;
    private int age;
    private boolean hasDiscountCard;

    public Buyer(String name, int age, boolean hasDiscountCard) {
        this.name = name;
        this.age = age;
        this.hasDiscountCard = hasDiscountCard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean hasDiscountCard() {
        return hasDiscountCard;
    }
}
