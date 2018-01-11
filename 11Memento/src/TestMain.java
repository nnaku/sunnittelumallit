public class TestMain {

	public static void main(String[] args) {

		Client players[] = new Client[5];
		TheRiddler riddler = new TheRiddler();
		for (int i = 0; i < players.length; i++) {
			players[i] = new Client("Player" + (i+1));
			players[i].start(riddler.join());
		}
		System.out.println("-------------------------");
		for (Client player : players) {
			player.quess(riddler);
			player.quess(riddler);
			player.quess(riddler);
			System.out.println("-------------------------");
		}

	}

}