package inherit;
class A{
    int i=30;
}
class B extends A{
    int j=23;
    int k=98;
}
class Test{
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.i);
        //System.out.println(a1.j);

        B b1 = new B();
        System.out.println(b1.j);
        System.out.println(b1.k);
    }
}