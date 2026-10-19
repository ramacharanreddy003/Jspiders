
interface I1 {

    void m1();
}

interface I2 {

    void m2();
}

class A {

    public void m1() {
        System.out.println("m1()-A");
    }
}

class B extends A implements I1, I2 {
    @Override
    public void m2() {
        System.out.println("m2()-B");
    }
}

public class Test1 {

    public static void main(String[] args) {
        I1 i1 = new B();
        i1.m1();
        I2 i2 = new B();
        i2.m2();
    }

}
