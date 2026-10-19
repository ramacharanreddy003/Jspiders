abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract public void area();
    abstract public void display();
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(String color,int length,int breadth){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void area(){
        System.out.println(length+breadth);
    }
    @Override
    public void display(){
        System.out.println("color: "+color);
        System.out.println("length: "+length);
        System.out.println("breadth: "+breadth);
    }
}
class Circle extends Shape{
    int radius;
    public Circle(String color,int radius) {
        super(color);
        this.radius=radius;
    }
    @Override
    public void area(){
        double res=3.14*radius*radius;
        System.out.println(res);
    }
    @Override
    public void display(){
        System.out.println("color: "+color);
        System.out.println("radius: "+radius);
    }
}
public class ShapeDriver{
    public static void main(String[] args) {
        Shape s = new Rectangle("white",10,15);
        s.area();
        s.display();
        System.out.println("===");
        s=new Circle("Red",10);
        s.area();
        s.display();
    }
}