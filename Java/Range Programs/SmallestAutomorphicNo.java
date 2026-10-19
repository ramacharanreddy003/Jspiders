public class SmallestAutomorphicNo{
    public static void main(String[] args) {
        for(int j=1;j<=100;j++){
            int n=j;
            //int m=n;
            int sq=n*n;
            boolean flag=true;
            for(int i=0;i<=n;i++){
                if(n%10!=sq%10){
                    flag=false;
                    break;
                }
                n/=10;
                sq/=10;
            }
            if(flag) System.out.println(j+" is a automorphic number");
            break;
          
        }
    }
} 