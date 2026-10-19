class TribonacciRange{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=1;
        while(true){
            int d=a+b+c;
            if(d>50) break;
            System.out.println(d);
            a=b;
            b=c;
            c=d;
        }

        
    }
}