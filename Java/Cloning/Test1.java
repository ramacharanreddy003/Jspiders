class Test1 implements Cloneable{
    int i=90;
    int j=91;
    public static void main(String[] args) throws CloneNotSupportedException{
        Test1 t1 = new Test1();
        Test1 t2 = (Test1)t1.clone();
        t2.i=100;
        t2.j=200;
        System.out.println(t1.i+" : "+t1.j);
        System.out.println(t2.i+" : "+t2.j);
        Test1 t3 = (Test1)t2.clone();
        t3.i=3;
        t3.j=9;
        System.out.println(t3.i+":"+t3.j);


    }
}