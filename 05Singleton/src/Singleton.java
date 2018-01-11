
public class Singleton {
    
    private static Singleton INSTANCE = null;
    
    private boolean available;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    
    public void drive(Driver driver) {
        driver.toString();
    }

}
