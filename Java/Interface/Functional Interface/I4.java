//@FunctionaInterface 
public interface I4{
    void m1();
    default void m2(){
        System.out.println("m2()-I4");
    }
    public static void m3(){
        System.out.println("m3()-I4");
    }
    default  void m4(){      //it gives error because without
                            // static, private, or default java teats as abstract method. 
                            //and abstract methods cannot have body
        System.out.println("m4()-I4");
    }
}
