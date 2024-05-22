package hw10.task1;

public class Product {
    private double cost;
    private String name;
    private boolean isAlcohol;

    public Product(String name, boolean isAlcohol, double cost) {
        this.cost = cost;
        this.name = name;
        this.isAlcohol = isAlcohol;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }
}
