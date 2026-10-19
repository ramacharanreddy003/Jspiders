class F{
    static void m1(){
        System.out.println("static m1 in class F");
    }
}
class G extends F{
    static void m1() {
        System.out.println("static m1 in class F");
    }
}
@SuppressWarnings("unused")
class Test3{
    public static void main(String[] args) {
        F f1 = new F();
        f1.m1();
        f1 = new G();
        f1.m1();
    }
}