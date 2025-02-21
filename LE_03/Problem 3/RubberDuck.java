public class RubberDuck implements Swim, Squeak {
    @Override
    public void swim() {
        System.out.println("RubberDuck is swimming.");
    }

    @Override
    public void squeak() {
        System.out.println("RubberDuck squeaks!");
    }
}