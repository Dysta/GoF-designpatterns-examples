package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers;
    private String state;

    public Subject(){
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void setState(String newState){
        state = newState;
        notifyAllObservers();
    }

    public String getState(){
        return state;
    }

    public void notifyAllObservers(){
        for (Observer o:observers) {
            o.update();
        }
    }
}
