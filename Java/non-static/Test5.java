class Fruit {
    String name;
    int price;
    private static int p = 100;
    {
        price = p;
        p++;
    }
    @SuppressWarnings("unused")
    Fruit() {
        name = "apple";
    }
    Fruit(String n) {
        name = n;
    }
}
@SuppressWarnings("unused")
class Test5 {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("banana");
        System.out.println(f1.name + " " + f1.price);
        Fruit f2 = new Fruit();
        System.out.println(f2.name + " " + f2.price);
        Fruit f3 = new Fruit("mango");
        System.out.println(f3.name + " " + f3.price);


    }
}
