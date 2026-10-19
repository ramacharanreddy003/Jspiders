class DecimalToBin{
    public static void main(String[] args){
        int n=12;
        int bin=0;
        int i=1;
        while(n>0){
            bin+=(n%2)*i;
            i*=10;
            n/=2;
        }
        System.out.println(bin);
    }

}