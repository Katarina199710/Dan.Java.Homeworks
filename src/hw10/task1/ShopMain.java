package hw10.task1;

public class ShopMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("Jesse", 25, false);
        Seller seller = new Seller("Heisenberg", true);
        Product product = new Product("Beer", true, 50.0);
        Shop shop = new Shop("Los Pollos Hermanos", seller, buyer, product);
        shop.returnCost();
    }
}
