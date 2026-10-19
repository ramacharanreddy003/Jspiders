class A{
    void m1(){
        System.out.println("m1() from  A class");
    }
}
class B extends A{

    void m1() {
        System.out.println("m1 from B class");
    }
    void m2(){
        System.out.println("m2 from B class");
    }
}
class C extends A{
    @Override
    void m1(){
        System.out.println("m1() from c class");
    }void m3(){
        System.out.println("m3 from c class");
    }
}
@SuppressWarnings("unused")
class Test3{
    public static void main(String[] args) {
        A a1 = new B();
        a1.m1();
        //a1.m2();
        a1 = new C();
        a1.m1();
    }
}