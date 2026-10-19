class D{
    int i;
    int j;
    D(int i,int j){
        this.i=i;
        this.j=j;
    }
    void m1(){
        System.out.println(i);
        this.m2();
    }
    void m2(){
        System.out.println(j);
    }
}
@SuppressWarnings("unused")
class Test6{
    public static void main(String[] args){
        D d1 = new D(10,20);
        d1.m1();
        D d2 = new D(1,2);
        d2.m1();


    }

}