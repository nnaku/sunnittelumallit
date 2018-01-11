package pointers;

import clock.Pointer;

public class Second extends Pointer {

	@Override
	public int getPointerPosition() {
		return getPosition() % 60;
	}
}