import java.util.ArrayList;

public class TimeGenerater {
    private ArrayList<TimeListener> ecouteur;

    public TimeGenerater(){
        ecouteur = new ArrayList<TimeListener>();
    }
    public void addTimeListener(TimeListener t){
        ecouteur.add(t);
    }

    private void remove(TimeListener t){
        ecouteur.remove(t);
    }

    public String toString(){
        String affichage="";
        for(TimeListener tl: ecouteur) {
            affichage += tl + "\n";
        }
        return affichage;
    }

    public void generateEvent(){
        TimeEvent event=new TimeEvent(this);
        for(TimeListener tl : ecouteur){
            tl.newData(event);
        }
    }
}
