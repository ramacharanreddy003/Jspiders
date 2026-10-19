//Auto boxing
public class Test{
    public static void main(String[] args) {
        int a=12;
        Integer b=a;    //autoboxing
        System.out.println("Primitive: "+a);
        System.out.println("Non-Primitive(wrapper): "+b);

        int c=20;
        Integer d = Integer.valueOf(c); //Boxing
        System.out.println("Primitive: "+c);
        System.out.println("Non-primitive: "+d);

        Integer n=30;   //autoboxing
        System.out.println("Non-primitive(wrapper): "+n);

    }
}