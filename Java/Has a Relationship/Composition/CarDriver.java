public class CarDriver{
    public static void main(String[] args) {
        //Car c = new Car("Tata",1232,"yellow");
        Car c1 = new Car("Benz",1212,"white",new Engine(2999));
        System.out.println(c1);
    }
}