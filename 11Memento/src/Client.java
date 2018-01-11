import java.util.concurrent.ThreadLocalRandom;

public class Client extends Thread{
    
    private String name;

    private Object o;
    
    public Client(String nimi) {
        this.name = nimi;
    }
    
    public String getname() {
		return name;
	}

	public void start(Object obj) {
        this.o = obj;
    }
    
    public void quess(TheRiddler riddler) {
        int rand = ThreadLocalRandom.current().nextInt(1, 10 + 1);
        System.out.println(name+" guess: " + rand);
        riddler.check(o, rand);
    }
}
