class EvenOrOddSum{
    public static void main(String[] args) {
        int esum=0,osum=0;
        for(int i=0;i<=10;i++){
            if(i%2!=0){
                osum+=i;
            }else{
                esum+=i;
            }
        }
        System.out.println("Even sum "+esum+" "+"\n"+"Odd sum "+osum);
    }
}