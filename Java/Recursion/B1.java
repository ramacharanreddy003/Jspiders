class B1{
    public static void main(String[] args) {
        display(1,10);
    }
    static void display(int start,int end) {
        if(start>end) return;
        System.out.println(start);
        display(start+1,end);
    }   
}