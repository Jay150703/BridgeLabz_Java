package objectorientedprogramming.bestprogrammingpractices.applications;

/*
 * Class: Product
 * Description: Abstract product class.
 */
public abstract class Product {

    private int productId;
    private String name;
    protected double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    public void displayProduct() {
        System.out.println("Product: " + name);
        System.out.println("Base Price: " + price);
    }
}
