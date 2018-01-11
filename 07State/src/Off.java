public class Off implements State{
	public void pressButton(Flashlight context) {
		context.setState(new On());
	}
}