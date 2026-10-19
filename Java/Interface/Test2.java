interface I1{
    default void m1(){
        System.out.println("m1()-I1");
    }
}
interface I2{
    default void m1(){
        System.out.println("m1()-I2");
    }
}
class A{
    public void m1(){
        System.out.println("m1()-A");
    }
}
class B extends A implements I1,I2{
    public void m1(){
        super.m1(); //calls A's m1
        I1.super.m1();
        I2.super.m1();
        System.out.println("m1()-B");
    }
} 
class Test2{
    public static void main(String[] args) {
        new B().m1();
    }
}