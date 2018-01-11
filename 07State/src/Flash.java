public class Flash implements State{
	public void pressButton(Flashlight context) {
		context.setState(new Off());
	}
}