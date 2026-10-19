class FibonacciRange{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(;;){
            int c=a+b;
            if(c>100) break;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}