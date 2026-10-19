public class NeonNumber{
    public static void main(String[] args) {
       int n=9;
       int sq=n*n;
       int sum=0;
       while(sq>0){
        int r=sq%10;
        sum+=r;
        sq/=10;
       }
       if(sum==n){
        System.out.println(n+" is a neon number");
       }else{
        System.out.println(n+" is not a neon number");
       }
    }
}