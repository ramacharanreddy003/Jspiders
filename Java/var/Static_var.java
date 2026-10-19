class Static_var{
    static int i=54;
    public static void main(String[] args){
        Static_var.m1();
        Static_var.i=55;
        Static_var.m1();
    }
    public static void m1(){
        System.out.println(Static_var.i);
    }
}