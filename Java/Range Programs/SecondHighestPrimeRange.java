public class SecondHighestPrimeRange{
    public static void main(String[] args) {
        int PrimeCount=0;
        for(int j=10;j>=1;j--){
            int n=j;
            boolean flag=true;
            if(n<=1) flag=false;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                PrimeCount++;
                if(PrimeCount==2){
                    System.out.println(j);
                }
            }
        }
    }
}