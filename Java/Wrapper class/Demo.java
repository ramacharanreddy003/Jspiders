//Auto unboxing
public class Demo{
    public static void main(String[] args) {
        Integer a =12;
        int b=a;    //Auto unboxing
        System.out.println("Non-primitive(wrapper): "+a);   //10
        System.out.println("Primitive: "+b);

        Integer c=20;
        int d=c.intValue(); //unboxing
        System.out.println("Non-primitive(wrapper): "+c);   
        System.out.println("Primitive: "+d);
        int n=new Integer(30);
        System.out.println("Primitive: "+n);
    }
}