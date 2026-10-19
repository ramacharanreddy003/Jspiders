abstract class A{
    A(){
        System.out.println("A()-cons");
    }
}
class B extends A{
    
}
public class Test2{
    public static void main(String[] args) {
        new B();
    }
}