class A{
    int i;
    void m1(){
        int i=1;
        System.out.println(i);
        System.out.println(this.i);
    }
}

@SuppressWarnings("unused")
class Test5{
    public static void main(String[] args){
        A a1 = new A();
        a1.i=323;
        a1.m1();

    }
}