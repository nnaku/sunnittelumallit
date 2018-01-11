package clock;

public abstract class Pointer implements Cloneable {
	private int position;

	public Pointer() {
		setPosition(0);
	}

	public void tick() {
		setPosition(getPosition() + 1);
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}

	public abstract int getPointerPosition();
}