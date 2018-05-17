package designPattern.observer;

import java.util.ArrayList;

public class Celebrity implements Subject {
    private ArrayList<Observer> fansList;
    private String name;

     Celebrity(String name){
        this.name= name;
        fansList= new ArrayList<>();
    }
    @Override
    public boolean subscribe(Observer fan) {
        return fansList.add(fan);

    }

    @Override
    public boolean unsubscribe(Observer fan) {
        return fansList.remove(fan);
    }

    @Override
    public void notifySubscribers(String msg) {
        for(Observer fan:fansList){
            fan.getUpdate(name+":"+msg);
        }

    }
}
