public class TribonacciSeries{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        for(int i=4;i<=10;i++){
            int d=a+b+c;
            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }
    }
}