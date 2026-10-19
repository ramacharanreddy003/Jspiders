class A{
    public static void main(String[] args) {
        System.out.println(add(2,3,4));
    
    }
    static int add(int... a){
        int sum=0;
        for(int n:a) sum+=n; 
        return sum;
    }
}