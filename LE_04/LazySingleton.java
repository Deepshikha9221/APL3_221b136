public class LazySingleton {
    private static LazySingleton instance;
    private static int counter = 0; 
    private LazySingleton() {
        counter++; 
        System.out.println("LazySingleton Instance Created! Counter: " + counter);
    }
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton(); 
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Lazy Singleton!");
    }
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        lazySingleton1.showMessage();

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        lazySingleton2.showMessage();
    }
}
