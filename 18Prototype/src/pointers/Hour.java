package pointers;
import clock.Pointer;

public class Hour extends Pointer{

	@Override
	public int getPointerPosition() {
		return getPosition()%24;
	}
}