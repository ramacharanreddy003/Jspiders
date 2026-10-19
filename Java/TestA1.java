class A{
    int i;
    A(int i){
        this.i=i;
    }
}
class B{
    void m1(A arg){
        System.out.println(arg.i);
    }
}
@SuppressWarnings("unused")
    class TestA1{
        public static void main(String[] args) {
            A a1 = new A(12);
            A a2 = new A(20);
            B b1 = new B();
            b1.m1(a1);
            
        }
    }

