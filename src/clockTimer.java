
import java.util.ArrayList;
import java.util.List;

public class clockTimer{

    List<digitalClock> observers = new ArrayList();

    int hour = 0;
    int minute = 0;

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void tick(){
        if (getMinute() == 59){
            setMinute(0);
            if (getHour() == 23){
                setHour(0);

            }
            else {
                setHour(getHour() + 1);
            }

        }
        else {
            setMinute(getMinute() + 1);
        }

        notif();

    }

    public void attach(digitalClock dc) {
        observers.add(dc);
    }
    public void detach(digitalClock dc) {
        observers.remove(dc);
    }

    public void notif(){
       for (digitalClock dc : observers){
           dc.update();
       }
    }


}
