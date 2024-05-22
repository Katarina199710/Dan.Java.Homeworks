package hw10.task3;

import java.util.EnumMap;
import java.util.Map;

public class FatherMain {
    public static void main(String[] args) {
        Father father = new Father("John Winchester", 500);
        Store store = new Store();

        Map<Product, Integer> shoppingList = new EnumMap<>(Product.class);
        shoppingList.put(Product.BEER, 3);
        shoppingList.put(Product.MILK, 6);

        try {
            father.goShopping(store, shoppingList);
        } catch (PurchaseException e) {
            System.out.println(e.getMessage());
        }
    }
}
