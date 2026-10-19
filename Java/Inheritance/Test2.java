class B{
    void m1(){
        System.out.println("m1() from B class");
    }
}
class C extends B{
    void m2(){
        System.out.println("m2() from c class");
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        B b1 = new B();
        b1.m1();
        //b1.m2();
        C c1 = new C();
        c1.m2();
        c1.m1();
    }

}