package objectorientedprogramming.inheritance.MultilevelInheritance.level1;

/*
 * Class: DeliveredOrder
 * Description: Represents delivered orders.
 */
public class DeliveredOrder extends ShippedOrder {

    private String deliveryDate;

    public DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }

    public static void main(String[] args) {
        DeliveredOrder order =
                new DeliveredOrder(101, "10-01-2026", "TRK101", "15-01-2026");
        System.out.println(order.getOrderStatus());
    }
}
