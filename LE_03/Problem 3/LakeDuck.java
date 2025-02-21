public class LakeDuck implements Swim, Fly, Quack {
    @Override
    public void swim() {
        System.out.println("LakeDuck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("LakeDuck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("LakeDuck quacks!");
    }
}