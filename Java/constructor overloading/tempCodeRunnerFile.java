class C{
    C(){
        System.out.println("constructor with 0 args");
    }
    C(int i){
        System.out.println("constructor with int args");
    }
    C(double d){
        System.out.println("constructor with double args");
    }
}
class Test4{
    public static void main(String[] args) {
        new C();
        new C(12);


    }
}