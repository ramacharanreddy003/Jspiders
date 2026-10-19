@FunctionalInterface
interface Sim{
    void connect();
}
class Airtel implements Sim{
    @Override
    public void connect(){
        System.out.println("call connected by Airtel");
    }
}
class JIO implements Sim{
    @Override
    public void connect(){
        System.out.println("call connected by Jio");
    }
}
class VI implements Sim{
    @Override
    public void connect(){
        System.out.println("call connected by Jio");
    }
}
class Phone{
    Sim s;
    public Phone(Sim s){
        this.s=s;
    }
    public void call(){
        s.connect();
    }
}
public class PhoneDriver{
    public static void main(String[] args) {
        Phone p1 = new Phone(new JIO());
        p1.call();
        Phone p2 = new Phone(new Airtel());
        p2.call();
        Phone p3 = new Phone(new VI());
        p3.call();
    }
}