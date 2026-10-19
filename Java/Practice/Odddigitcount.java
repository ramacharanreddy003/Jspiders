class Odddigitcount{
    public static void main(String[] args) {
        int n=987;
        while(n>0){
            int d=n%10;
            if(n%2!=0){
                System.out.println(d);
            }
            n/=10;
        }
    }
}