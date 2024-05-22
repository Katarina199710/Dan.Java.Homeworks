package hw10.task1;

public class Seller {
    private String name;
    private boolean isHonest;

    public Seller(String name, boolean honest) {
        this.name = name;
        this.isHonest = honest;
    }

    public String getName() {
        return name;
    }

    public boolean isHonest() {
        return isHonest;
    }
}
