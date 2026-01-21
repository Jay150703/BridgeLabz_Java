package objectorientedprogramming.inheritance.HybridInheritance.level1;

/*
 * Class: Waiter
 * Description: Waiter inherits Person and implements Worker.
 */
public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers");
    }

    public static void main(String[] args) {
        Worker chef = new Chef("Arun", 1);
        Worker waiter = new Waiter("Kumar", 2);

        chef.performDuties();
        waiter.performDuties();
    }
}
