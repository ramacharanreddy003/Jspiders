public class Prime{
    public static void main(String[] args) {
        int n=2;
        boolean flag=true;
        if(n<1) flag=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
}