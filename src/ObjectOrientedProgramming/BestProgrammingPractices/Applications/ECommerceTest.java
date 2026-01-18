package ObjectOrientedProgramming.BestProgrammingPractices.Applications;

/*
 * Class: ECommerceTest
 * Description: Demonstrates polymorphism.
 */
public class ECommerceTest {

    public static void main(String[] args) {

        Product product = new Electronics(1, "Laptop", 60000);

        product.displayProduct();

        Taxable tax = (Taxable) product;

        double finalPrice =
                product.getFinalPrice() + tax.calculateTax();

        System.out.println(tax.getTaxDetails());
        System.out.println("Final Price: " + finalPrice);
    }
}
