class SingleDigitTrip{
    static String checkdigit(int n){
        if(n>=0 && n<=9){
            return "single digit";
        }else if(n>=10 && n<=99){
            return "Double digit";
        }else if(n>=100 && n<=999){
            return "Triple digit";
        }
        return "More than three digit";
    }
    public static void main(String[] args) {
        int n=98;
        System.out.println(checkdigit(n));
    }
}
