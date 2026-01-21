package objectorientedprogramming.inheritance.HybridInheritance.level1;

/*
 * Class: Chef
 * Description: Chef inherits Person and implements Worker.
 */
public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is preparing food");
    }
}
