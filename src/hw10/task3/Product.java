package hw10.task3;

public enum Product {
    APPLE(30),
    POTATO(40),
    MILK(60),
    BEER(70),
    TOBACCO(90);

    private final int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
