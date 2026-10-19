class TwoDigitOrNot{

    public static  boolean  checkTwoDigit(int n){
        if(n>=10 && n<100){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=50;
        System.out.println(checkTwoDigit(n));
    }
}