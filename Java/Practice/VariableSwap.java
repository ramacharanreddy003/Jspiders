class VariableSwap{
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=0;
        System.out.println("Before: "+a);
        System.out.println("Before: "+b);
        c=b;
        b=a;
        a=c;
       
        System.out.println("After swapping: a="+a);
        System.out.println("After swapping: b="+b);

    }
}