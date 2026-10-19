class E{
    E(){
        System.out.println("E()");

    }
    E(int i){
        this();
        System.out.println("E(int)");
    }
}
@SuppressWarnings("unused")
class Test5{
    public static void main(String[] args) {
        new E(18);
    }
}