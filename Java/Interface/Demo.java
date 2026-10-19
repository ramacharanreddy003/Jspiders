interface I3{
    void m1();
    default void m2(){
        System.out.println("m2()-I3");
    }
}
class D implements I3{
    @Override
    public void m1(){
        System.out.println("m1()-B");
    }
}
class C implements I3{
    @Override
    public void m1(){
        System.out.println("m1()-C");
    }
    @Override
    public void m2(){
        System.out.println("m2()-C");
    }
}
public class Demo{
    public static void main(String[] args){
        I3 i3 = new D();
        i3.m1();
        i3.m2();

        I3 i = new C();
        i.m1();
        

    }
}