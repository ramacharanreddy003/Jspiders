
class Animal {

    void move() {
        System.out.println("running");
    }
}

class Snake extends Animal {
    @Override
    void move() {
        System.out.println("crawl");
    }
}
@SuppressWarnings("unused")
class Test4 {

    public static void main(String[] args) {
        Snake s = new Snake();
        s.move();
        Animal a = new Animal();
        a.move();
    }
}
