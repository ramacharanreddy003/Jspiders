class AA{
    static int m1(){
        System.out.println("m1 starts");
        return 10;
    }
    public static void main(String[] args) {
        m1();
        int i=m1();
        System.out.println("i = "+i);
        int j=m1()*5;
        System.out.println("j = "+j);
        System.out.println(m1());
        if(m1()>0){
            System.out.println("executing if");
        }
    }
}