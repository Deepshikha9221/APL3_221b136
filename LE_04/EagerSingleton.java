public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private static int counter = 0;
        private EagerSingleton() {
        counter++; 
        System.out.println("EagerSingleton Instance Created! Counter: " + counter);
    }
        public static EagerSingleton getInstance() {
        return instance; 
    }
    public void showMessage() {
        System.out.println("Hello from Eager Singleton!");
    }
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance(); 
        eagerSingleton1.showMessage();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance(); 
        eagerSingleton2.showMessage();
    }
}
