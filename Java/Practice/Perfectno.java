class Perfectno{
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=0;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }
    }
}