package objectorientedprogramming.inheritance.MultilevelInheritance.level1;

/*
 * Class: ShippedOrder
 * Description: Represents shipped orders.
 */
public class ShippedOrder extends Order {

    protected String trackingNumber;

    public ShippedOrder(int orderId, String date, String trackingNumber) {
        super(orderId, date);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}
