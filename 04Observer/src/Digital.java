import java.util.Observable;
import java.util.Observer;
public class Digital implements Observer{  
    private Clock clock;
    public Digital() {}
    public void update(Observable o, Object arg) {
        clock = (Clock) o;
        clock.getTime();
    }
}