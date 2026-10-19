interface I1{
    void m1();
}
interface I2{
    void m2();
}
abstract class A{
    abstract void m3();
}
class B extends A implements I1,I2{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
    public void m2(){
        System.out.println("m2()-B");

    }
    @Override
    void m3(){
        System.out.println("m3()-B");
    }
}
public class Test{
    public static void main(String[] args) {
        I1 i1 = new B();
        i1.m1();
        //i1.m2();
        //i1.m3();

        I2 i2 = new B();
        i2.m2();
        A a = new B();
        a.m3();
    }
}