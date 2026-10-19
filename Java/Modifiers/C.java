public class C{
    static void m1(int a) {
        a*=30;
        System.out.println("a="+a);
        System.out.println("m1 executed");
    }
    public static void main(String[] args){
        int a=10;
        m1(a);
         System.out.println("a="+a);

    }
}