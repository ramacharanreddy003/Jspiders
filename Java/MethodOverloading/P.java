class P{
    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1,2);
    }
    static void m1(){
        System.out.println("m1() called");
    }
    static void m1(int i) {
        System.out.println("m1(int i)");
        
    }
    static void m1(int i,int j){
        System.out.println("m1(int, int)");
    }
}