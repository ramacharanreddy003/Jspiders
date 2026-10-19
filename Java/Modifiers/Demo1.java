public class Demo1{
    public static void main(String[] args){
        m1(4);
        m1(2,3,4,5);
    }
    static void m1(int... a) {
        for(int n:a){
            System.out.println(n+" ");
        }System.out.println();
    }
}