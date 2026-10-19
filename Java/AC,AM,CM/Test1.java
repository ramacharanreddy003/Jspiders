abstract class A{
    abstract public void m1();
    public abstract void m2();
}
abstract class B extends A{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
}
class C extends B{
    @Override
    public void m2(){
        System.out.println("m2()-C");
    }
}
public class Test1{
    public static void main(String[] args) {
        //A a = new B();
        A a = new C();
        a.m1();
        a.m2();

        B b = new C();
        b.m1();
        b.m2();

    }
}