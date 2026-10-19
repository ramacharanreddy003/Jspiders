class A{
   
    void m1(){
        System.out.println("m1 imp in class A");
    }
}
class B extends A{
    @Override
    void m1(){
        System.out.println("m1 in class B");
    }
}

class Test{
    public static void main(String[] args){
        B b = new B();
        b.m1();
        
        A a = new A();
        a.m1();
    }
}