
class Pen {

    String color;
    double price;

    public Pen(String color, double price) {
        super();
        this.color = color;
        this.price = price;
    }
    @Override
    public String toString(){
        return color+":"+price;
    }
}   
    @SuppressWarnings("unused")
class Test {

        public static void main(String[] args) {
            Pen p1 = new Pen("blue", 10);
            System.out.println(p1.toString());
            System.out.println(p1);

            Pen p2 = new Pen("red",5);
            System.out.println("------");
            System.out.println(p2);

        }
    }
