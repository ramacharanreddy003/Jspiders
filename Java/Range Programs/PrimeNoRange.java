public class PrimeNoRange{
    public static void main(String[] args) {
        for(int j=1;j<=10;j++){
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
            System.out.println(j+" is prime number");
        
        }
    }
    }   
}