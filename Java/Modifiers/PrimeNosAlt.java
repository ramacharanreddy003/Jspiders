class PrimeNosAlt{
    public static void main(String[] args) {
        displayPrimeNos(1, 100);
    }
    public static void displayPrimeNos(int a,int b){
        int count=0;
        for(int i=a;i<=b;i++){
            if(isPrime(i)){
                count++;
                if(count%2!=0) System.out.println(i);

            }
        }
    }
    public static boolean isPrime(int n){
       if(n<=1) return false;
       for(int i=2;i<=n/2;i++){
        if(n%i==0) return false;
       }
       return true;
    }
}