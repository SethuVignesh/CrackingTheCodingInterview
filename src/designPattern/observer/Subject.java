package designPattern.observer;

public interface Subject {
    boolean subscribe(Observer observer);

    boolean unsubscribe(Observer observer);

    void notifySubscribers(String msg);
}
