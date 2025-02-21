public class Main {
    public static void main(String[] args) {
        Test a = new Test();
        a.display();
        
        // AbsTest b= new AbsTest();
        // b.display();
        // Abstest cannot ne instantiated. 
        
        ConcreteAbsTest c = new ConcreteAbsTest();
        c.display();
    }
}