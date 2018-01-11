import java.util.concurrent.ThreadLocalRandom;

public class TheRiddler {

	public Object join() {
		int rand = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		System.out.println("Right answer:" + rand);
		return new Memento(rand);
	}

	public void check(Object o, int quess) {
		Memento memento = (Memento) o;
		if (memento.getNum() == quess) {
			System.out.println("Correnct answer");
		}
	}

}
