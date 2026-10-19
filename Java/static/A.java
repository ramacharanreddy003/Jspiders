class A{
    static {
        System.out.println("static block in a");
        main(null);
    }
    public static void main(String[] args) {
        System.out.println("Hello");    
    }
}