package objectorientedprogramming.inheritance.MultilevelInheritance.level1;

/*
 * Class: Order
 * Description: Base class for orders.
 */
public class Order {

    protected int orderId;
    protected String orderDate;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return "Order Placed";
    }
}
