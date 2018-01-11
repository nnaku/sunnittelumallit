package pointers;

import clock.Pointer;

public class Minute extends Pointer {

	@Override
	public int getPointerPosition() {
		return getPosition() % 60;
	}
}