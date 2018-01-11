import java.util.Arrays;

class Coinflip extends Game {
	int round;
	boolean evenTurn;
	boolean roundFlips[];

	void initializeGame(int playerCount) {
		round = 0;
		evenTurn = false;
		roundFlips = new boolean[playerCount];
	}
	void evenTurn(boolean isEven) {
		evenTurn = isEven;
	}
	void makePlay(int player) {
		roundFlips[player] = Math.random() < 0.5;
	}
	boolean endOfGame() {
		if (evenTurn) {
			System.out.println("Round: "+(++round));
			System.out.println(Arrays.toString(roundFlips));
			int sum = 0;
			for (boolean b : roundFlips) {
				sum += b ? 1 : 0;
			}
			if (sum == 1) {
				return true;
			}
		}
		return false;
	}

	void printWinner() {
		int i = 0;
		while(!roundFlips[i++]);
		System.out.println("Winner winner chiken dinner!");
		System.out.println("Player "+(i)+" wins!");
	}
}