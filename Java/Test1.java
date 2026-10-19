class B{
    int i;
    void m2(){
        System.out.println(i);
    }
}
@SuppressWarnings("unused")
class Test1{
public static void main(String[] args){
    B b1 = new B();
    b1.i=537;
    B b2 = new B();
    b2.i=20;
    b1.m2();
    b2.m2();
}
}