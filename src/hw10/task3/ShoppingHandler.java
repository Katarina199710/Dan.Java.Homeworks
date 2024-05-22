package hw10.task3;

import java.util.Map;

public class ShoppingHandler {
    public static void handleShopping(Father father, Store store, Map<Product, Integer> shoppingList) throws PurchaseException {
        int totalCost = 0;
        for (Map.Entry<Product, Integer> entry : shoppingList.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            if (quantity % 3 != 0) {
                throw new PurchaseException("The quantity of goods " + product + " is not divisible by three.");
            }
            if (product == Product.BEER || product == Product.TOBACCO) {
                throw new PurchaseException("You cannot bring " + product + " home.");
            }
            totalCost += store.getPrice(product) * quantity;
        }
        if (totalCost > father.getMoney()) {
            throw new PurchaseException("The purchase amount exceeds the amount of money in your pocket.");
        }
        father.setMoney(father.getMoney() - totalCost);
        printReceipt(father, shoppingList, totalCost);
    }

    private static void printReceipt(Father father, Map<Product, Integer> shoppingList, int totalCost) {
        System.out.println("Dear " + father.getName() + ", the cost of your purchases is " + totalCost + ".");
        for (Map.Entry<Product, Integer> entry : shoppingList.entrySet()) {
            System.out.println("You purchased " + entry.getKey() + " in quantity " + entry.getValue() + ".");
        }
    }
}
