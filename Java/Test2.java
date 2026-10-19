
class C {

    int i;

    void m2() {
        Test2 ref = new Test2();
        System.out.println(i);
        System.out.println(ref.i);
        
    }
}
class Test2{
    int i;
    public static void main(String[] args) {
        C c1 = new C();
        c1.i = 12;
        c1.m2();
        


    }
}
