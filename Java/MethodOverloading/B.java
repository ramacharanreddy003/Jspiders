class B{
    public static void main(String[] args) {
        int n=10;
        m1(n);
        m1((double)n);
    }
    static void m1(double d){
        System.out.println("m1(double d)");

    }
    static void m1(int a) {
        System.out.println("m1(int a)");
    }
}
