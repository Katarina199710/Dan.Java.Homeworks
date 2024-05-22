package hw10.task3;

import java.util.Map;

public class Father {
    private final String name;
    private int money;

    public Father(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void goShopping(Store store, Map<Product, Integer> shoppingList) throws PurchaseException {
        ShoppingHandler.handleShopping(this, store, shoppingList);
    }
}
