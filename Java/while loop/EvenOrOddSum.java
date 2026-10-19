public class EvenOrOddSum{
    public static void main(String[] args) {
        int n=214367;
        int eSum=0;
        int oSum=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                eSum+=digit;
            }else{
                oSum+=digit;
            }
            n/=10;
        }
        System.out.println("Even Sum "+eSum);
        System.out.println("Odd sum "+oSum);
    }
}