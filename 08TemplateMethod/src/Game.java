/**
 * An abstract class that is common to several games in which players play
 * against the others, but only one is playing at a given time.
 */

abstract class Game {

	protected int playersCount;

	abstract void initializeGame(int playerCount);

	abstract void makePlay(int player);
	
	abstract void evenTurn(boolean isEven);
	
	abstract boolean endOfGame();

	abstract void printWinner();

	/* A template method : */
	public final void playOneGame(int playersCount) {
		this.playersCount = playersCount;
		initializeGame(playersCount);
		int j = 0;
		do  {
			makePlay(j);
			j = (j + 1) % playersCount;
			evenTurn(playersCount == j+1);
		}while (!endOfGame());
		printWinner();
	}
}