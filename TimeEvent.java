import java.util.EventObject;
import java.util.GregorianCalendar;

public class TimeEvent extends EventObject {
    private GregorianCalendar date;

    public TimeEvent(Object source){
        super(source);
        this.date = new GregorianCalendar();
    }
    public  String toString(){
        return String.valueOf(this.date.getTime());
    }

}
