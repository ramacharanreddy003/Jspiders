public class PrimeNumber{
    public static void main(String[] args){
        int n=22;
        boolean flag=true;
        if(n<=1) flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}