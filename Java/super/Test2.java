class D{
    int i;
    D(){
        i=122;
    }

}
class E extends D{
    int j;
    E(){
        j=20;
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        E e1 = new E();
        System.out.println(e1.i);
        System.out.println(e1.j);
    }
}