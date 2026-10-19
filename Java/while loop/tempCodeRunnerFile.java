public class LastDigit{
    public static void main(String[] args) {
        
        // while(n>0){
        //     int r=n%10;
        //     System.out.println(r);
        //     n=n/10;
        // }

        //sum of digits
        int n=555;
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);


    }
}