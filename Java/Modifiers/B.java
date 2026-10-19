public class B{
    static void m1(int a) {
        System.out.println("a= "+a);
    }
    static public void main(String[] args) {
        m1(10);
        m1(20+23);
        int i=20;
        m1(i);
    }
}