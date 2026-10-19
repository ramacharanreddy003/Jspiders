@SuppressWarnings({"unused", "InitializerMayBeStatic"})
class C{
    static{
        System.out.println("static block in c");
    }
    {
        System.out.println("non-static block in c");
    }
    C(){

        System.out.println("constructor in c");
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        System.out.println("main");
        new C();
    }
}
