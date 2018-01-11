package clock;

import pointers.*;

public class Clock implements Runnable, Cloneable {
	private boolean running = false;
	public Pointer hour, minute, second;

	public Clock() {
		hour = new Hour();
		minute = new Minute();
		second = new Second();
	}

	public String getTime() {
		int h, m, s;
		h = hour.getPointerPosition();
		m = minute.getPointerPosition();
		s = second.getPointerPosition();
		return String.format("%02d:%02d:%02d", h, m, s);
	}

	public void setTime(int hour, int minute, int second) {

		this.hour.setPosition(hour);
		this.minute.setPosition(minute);
		this.second.setPosition(second);
	}

	public void tick() {
		second.tick();
		if (second.getPointerPosition() == 0) {
			minute.tick();
			if (minute.getPointerPosition() == 0) {
				hour.tick();
			}
		}
	}

	@Override
	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.hour = (Pointer) hour.clone();
			clock.minute = (Pointer) minute.clone();
			clock.second = (Pointer) second.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clock;
	}

	public void stop() {
		running = false;
	}

	@Override
	public void run() {
		running = true;
		while (running) {
			tick();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}