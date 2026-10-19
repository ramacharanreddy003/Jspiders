class Car{
    int num;
    String color;
    private static int n=120;
    {
        num=n;
        n++;
    }
    Car(){
        color="white";
    }
    @SuppressWarnings("unused")
    Car(String c){
        color=c;

    }
}
@SuppressWarnings("unused")
class Test3{
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.num+" "+c1.color);
        Car c2 = new Car();
        System.out.println(c2.num+" "+c2.color);
        Car c3 = new Car("green");
        System.out.println(c3.num+" "+c3.color);
        Car c4 = new Car();
        System.out.println(c4.num+" "+c4.color);
        Car c5 = new Car("orange");
        System.out.println(c5.num+" "+c5.color);
    }
}
    