
@SuppressWarnings("unused")
class Box {

    int height = 9;
    int length = 7;
    int width = 8;

    Box() {

    }

    Box(int h, int l, int w) {
        height = h;
        width = w;
        length = l;
    }

    Box(int n) {
        height = n;
        length = n;
        width = n;

    }

    void display() {
        System.out.println("[" + height + "," + length + "," + width + "]");

    }
}

@SuppressWarnings("unused")
class BoxTest {

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();
        Box b2 = new Box(1, 2, 3);
        b2.display();
        Box b3 = new Box(2, 4, 5);
        b3.display();

    }
}
