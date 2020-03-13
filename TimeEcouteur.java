import java.util.ArrayList;

public class TimeEcouteur implements  TimeListener {
    ArrayList<TimeEvent> events;
    public TimeEcouteur(){
        events= new ArrayList<TimeEvent>();
    }

    @Override
    public void newData(TimeEvent t) {
        events.add(t);
        System.out.println("Ajout d'un event");
    }
    public String toString(){
        String affichage="";
        for(TimeEvent e: events) {
            affichage += "L'event a était creer :" + e + "\n";
        }
        return affichage;
    }
}
