class A{
    void m1(){
        System.out.println("m1() from A class");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2() from B class");
    }
}
class C extends B{
    void m3(){
        System.out.println("m3() from C class");
    }
}
@SuppressWarnings("unused")
class Test1{
    public static void main(String[] args) {
        //A a1 = null;
        //a1.m1();                                                                                 
        A a1 = new A();
        //a1.null();

        a1 = new B();
        a1.m1();
        
    }
}