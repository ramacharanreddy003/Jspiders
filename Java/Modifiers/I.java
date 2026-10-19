
class I {

    public static void main(String... args) {
        m1(2);
        m1(90.8);
        m1('A');//auto widening

        int n = (int) Math.pow(5, 3);
        System.out.println(n);
    }

    static void m1(double d) {
        System.out.println(d);
    }

}
