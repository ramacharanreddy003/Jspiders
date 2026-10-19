class D{
    public static void main(String[] args){
        System.out.println(m1(1));
    }
    static int m1(int i){
        if(i%3==0) return i;
        return m1(i+1)+i;
    }
}