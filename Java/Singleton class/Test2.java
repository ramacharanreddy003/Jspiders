class A{
    static A a1;
    private A(){

    }
public static A getInstance(){
   
    if(a1==null)
    return a1=new A();
    else
        return a1;
}
}
class Test2{
    public static void main(String[] args) {
        A a1 = A.getInstance();
        A a2 = A.getInstance();
        A a3 = A.getInstance();
        A a4 = A.getInstance();
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a1==a2);
        System.out.println(a3==a4);

    }
}