class F{
    static int i;
    int j;
    public static void main(String[] args){
        F f1 = new F();
        F f2 = new F();
        f1.i=12;
        f2.i=23;
        System.out.println(f1.i);
        System.out.println(f2.i);

        f1.j=34;
        f2.j=35;
        System.out.println(f1.j);
        System.out.println(f2.j);
    }
}