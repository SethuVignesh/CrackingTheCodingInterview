package designPattern.observer;

public class Fan1 implements Observer {
    @Override
    public void getUpdate(String update) {
        System.out.println("Fan 1 got update "+update);
    }
}
