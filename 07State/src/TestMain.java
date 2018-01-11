public class TestMain {
	public static void main(String[] args) {
		// Ei pystyny pokemoneja, otsalamppu kiinnostaa enemmän.
		Flashlight fikkari = new Flashlight();
		System.out.println("Uusi Otsalamppu on tilassa : "+fikkari.getState().getClass().getName());
		fikkari.button();
		fikkari.button();
		fikkari.button();
	}
}