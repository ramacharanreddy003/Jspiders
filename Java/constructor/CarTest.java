class Car{
    int num;
    String color;
    private static int x=1000;
    Car(String c){
        num=x;
        x++;
        color=c;
    }
    void display(){
        System.out.println("num = "+num+" color = "+color);
    }
}
@SuppressWarnings("unused")
class CarTest{
    public static void main(String[] args) {
        Car c1 = new Car("Yellow");
        Car c2 = new Car("red");
        Car c3=new Car("red");
        c1.display();
        c2.display();
        c3.display();
        Car c4 = new Car("White");
        c4.display();

    }
}