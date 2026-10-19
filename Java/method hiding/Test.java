class E{
    static void m1(){
       System.out.println("static m1() in class E"); 
    }
}
class F extends E{
    static void m1(){ 
        System.out.println("static m1 in F");
    }
}
class Test{
    public static void main(String[] args) {
        F.m1();
    }
}