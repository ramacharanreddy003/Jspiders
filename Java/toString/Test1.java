class Pen {

    String color;
    double price;

    public Pen(String color, double price) {
        super();
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return color + ":" + price;
    }

    public boolean equals(Object o) {
        Pen p = (Pen) o;
        return this.color.equals(p.color) && this.price == p.price;
    }
}

@SuppressWarnings("unused")
class Test1 {

    public static void main(String[] args) {
        Pen p1 = new Pen("blue", 15);
        Pen p2 = new Pen("blue", 10);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

    }
}
