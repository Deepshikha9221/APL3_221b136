public class DuckTest {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        // Test RubberDuck
        System.out.println("RubberDuck:");
        rubberDuck.swim();
        rubberDuck.squeak();

        // Test WoodenDuck
        System.out.println("\nWoodenDuck:");
        woodenDuck.swim();
        woodenDuck.beMute();

        // Test RedHeadDuck
        System.out.println("\nRedHeadDuck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        // Test LakeDuck
        System.out.println("\nLakeDuck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}