public class WoodenDuck implements Swim, Mute {
    @Override
    public void swim() {
        System.out.println("WoodenDuck is swimming.");
    }

    @Override
    public void beMute() {
        System.out.println("WoodenDuck is mute.");
    }
}