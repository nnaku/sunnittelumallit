import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clock extends Observable implements Runnable {

	int time, s, m, h;

	public Clock() {
		s = m = h = 0;
	}

	public void tick() {
		time++;
		s = time % 60;
	    m = (time / 60) % 60;
	    h = (time / (60 * 60)) % 24;
	    
		setChanged();
		notifyObservers();
	}

	public void getTime() {
		System.out.print(String.format("%02d:%02d:%02d", h,m,s)+"\r");
	}

	public void run() {
		int ticks = 0;
		while(ticks < 86400) {
			tick();
			ticks++;
			try {
				
				Thread.sleep(0); // Staring at the clock?!
			} catch (InterruptedException ex) {
				Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
