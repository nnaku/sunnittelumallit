import clock.Clock;

public class TestMain {
	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		
		Clock clock = new Clock();
		Clock clone = clock.clone();
		System.out.println("Clock created");
		System.out.println("Clock cloned\n");
		
		System.out.println("Clone time set to " + clone.getTime());
		
		clone.setTime(12, 00, 00);
		System.out.println("Clone time set to " + clone.getTime() + "\n");
		
		new Thread(clock).start();
		new Thread(clone).start();
		
		System.out.println("Clock (id: " + clock.hashCode() + ") started.");
		System.out.println("Clone (id: " + clone.hashCode() + ") started.\n");

		for (int i = 0; i < 5; i++) {
			System.out.println("Thread clock "+clock.getTime()+"\nThread clone "+clone.getTime());
			Thread.sleep(1000);
		}
		clock.stop();
		clone.stop();
		System.out.println();
		System.out.println("Clock\t" + clock.hour.getClass().getName() + " : id " + clock.hour.hashCode() + " | "
				+ clock.minute.getClass().getName() + " : id " + clock.minute.hashCode() + " | "
				+ clock.second.getClass().getName() + " : id " + clock.second.hashCode());
		System.out.println("Clone\t" + clone.hour.getClass().getName() + " : id " + clone.hour.hashCode() + " | "
				+ clone.minute.getClass().getName() + " : id " + clone.minute.hashCode() + "   | "
				+ clone.second.getClass().getName() + " : id " + clone.second.hashCode()+"\n");
		
	}
}
