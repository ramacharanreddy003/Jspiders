interface I3{
    public static void m1(){
        System.out.println("m1()-I3");
    }
}
class BB implements I3{
    public static void m1(){
        System.out.println("m1()-BB");
    }
}
public class Demo1{
    public static void main(String[] args) {
        I3 i3 = new BB();
        //i3.m1();
        I3.m1();
    }
}