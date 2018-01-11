public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Digital digi = new Digital();
        clock.addObserver(digi);
        new Thread (clock).start();
    }
}