class StrToInt{
    public static void main(String[] args) {
        // String s="24639";
        // int n=0;
        // for(int i=0;i<s.length();i++){
        //     char C=s.charAt(i);
        //     n=(n*10)+(C-'0');
        // }System.out.println(n);

    //     String s="12345a";
    //     int n=Integer.parseInt(s);
    //     System.out.println(n);   //throws num format exception

        int sum=2;
        for(String s:args){
            sum+=Integer.parseInt(s);

        }
        System.out.println(sum);
     
    }
}