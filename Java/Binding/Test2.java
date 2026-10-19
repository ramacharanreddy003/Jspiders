class B{
    int i=10;
    int get(){
        return i;
    }
}
class E extends B{
    int i=20;
    int get(){
        return i;
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        E d1 = new E();
        System.out.println(d1.i);
        System.out.println(d1.get());

    }
}