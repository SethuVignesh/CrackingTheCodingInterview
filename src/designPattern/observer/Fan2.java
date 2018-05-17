package designPattern.observer;

public class Fan2 implements Observer {
    @Override
    public void getUpdate(String update) {
        System.out.println("Fan 2 got update "+update);
    }
}
