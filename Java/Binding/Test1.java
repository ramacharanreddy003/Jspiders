class A{

}
class B extends A{
    void m2(){
        System.out.println("m2 in B");
    }
}
class C extends A{
    
    void m3(){
        System.out.println("m3 in C");
    }
}
@SuppressWarnings("unused")
class Test1{
    public static void main(String[] args) {
        A a1  = new B();
        //a1.m2();
        //B b1 = a1;
        B b1 = (B)a1;
        b1.m2();
        ((B)a1).m2();
        C c1 = new C();
        c1.m3();
    }
}