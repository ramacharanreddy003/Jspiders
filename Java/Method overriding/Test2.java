class Phone{
    void call(){
        System.out.println("calling using 4g");
    }
}
class Smartphone extends Phone{
    @Override
    void call(){
        System.out.println("calling using 5g");
    }
}
class Test2{
    public static void main(String[] args) {
        Smartphone p = new Smartphone();
        p.call();
    }
}