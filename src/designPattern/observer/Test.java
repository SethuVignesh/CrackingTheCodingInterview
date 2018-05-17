package designPattern.observer;

public class Test {

    public static void main(String[] args) {
        Celebrity celebrity= new Celebrity("Vijayakanth");

        Fan1 fan1= new Fan1();
        Fan2 fan2= new Fan2();
        Fan3 fan3= new Fan3();

        celebrity.subscribe(fan1);
        celebrity.subscribe(fan2);
        celebrity.subscribe(fan3);



        celebrity.unsubscribe(fan1);
        celebrity.notifySubscribers("thooki adichiruvaen aathuko");
    }
}
