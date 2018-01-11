public class On implements State{
	public void pressButton(Flashlight context) {
		context.setState(new Flash());
	}

}
