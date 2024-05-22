package hw10.task1;

public class Shop implements Purchase{
    private String name;
    private Seller seller;
    private Buyer buyer;
    private Product product;

    public Shop(String name, Seller seller, Buyer buyer, Product product) {
        this.name = name;
        this.seller = seller;
        this.buyer = buyer;
        this.product = product;
    }

    @Override
    public void returnCost() {
        double cost = product.getCost();
        if (buyer.hasDiscountCard()) {
            cost *= 0.9;
        }
        if (seller.isHonest() && product.isAlcohol() && buyer.getAge() < 18) {
            System.out.println("Sorry, the seller is honest and won't sell alcoholic products to a minor.");
        } else {
            System.out.println("Dear " + buyer.getName() + ", the seller " + seller.getName() +
                    " of our store \"" + name + "\", will sell you this product " +
                    product.getName() + ". They have alcoholic products and your age is " + buyer.getAge() +
                    ". The cost of your purchase is " + cost);
        }
    }
}
