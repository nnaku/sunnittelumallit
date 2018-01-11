public class Flashlight {
	private State state;
	Flashlight() {
		this.state = new Off();
	}
	public void button() {
		state.pressButton(this);
		System.out.println("Nappia painettu! Tila: "+state.getClass().getName());
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return state;
	}
}