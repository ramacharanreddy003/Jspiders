public class SumOfEvenandOdd{
    public static void main(String[] args){
        int evenSum=0;
        int oddSum=0;

        for(int i=1;i<=10;i++){
            if(i%2!=0){
                oddSum+=i;
            }else{
                evenSum+=i;
            }
            
        }
        System.out.println("Odd sum "+oddSum+"\n"+"Even sum "+evenSum);
    }
}