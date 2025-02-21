public class RedHeadDuck implements Swim, Fly, Quack {
    @Override
    public void swim() {
        System.out.println("RedHeadDuck is swimming.");
    }

    @Override
    public void fly() {
        System.out.println("RedHeadDuck is flying.");
    }

    @Override
    public void quack() {
        System.out.println("RedHeadDuck quacks!");
    }
}