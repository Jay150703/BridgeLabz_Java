package ObjectOrientedProgramming.BestProgrammingPractices.Applications;

/*
 * Class: Electronics
 * Description: Electronics product with tax.
 */
public class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }

    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied";
    }
}
