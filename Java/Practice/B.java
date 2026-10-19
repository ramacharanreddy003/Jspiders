class B{
    static int i=9;
    public static void main(String[] args) {
        m1();
        @SuppressWarnings("unused")
        int i=8;

        int c=5;
        int d= ++c +2;
        System.out.println("d="+d);
       
    }
    public static void m1(){
        System.out.println(B.i);
    }
}