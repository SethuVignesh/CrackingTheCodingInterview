package designPattern.observer;

public class Fan3 implements Observer {
    @Override
    public void getUpdate(String update) {
        System.out.println("Fan 3 got update "+update);
    }
}
