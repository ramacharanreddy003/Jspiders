class A{
    void m1(){
        System.out.println("m1 in A");
    }
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
class Test{
    public static void main(String[] args) {
        A a1= new B();
        a1.m1();
        a1.m1();
       
    }
}