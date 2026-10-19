class Box{
    int height;
    int width;
    int length;
    @SuppressWarnings("unused")
    Box(){

    }
    Box(int h,int l,int w){
        height=h;
        width=w;
        length=l;
    }
    @SuppressWarnings("unused")
    Box(int n){
        this(n,n,n);
    }
    void display(){
        System.out.println("["+height+","+length+","+width+"]");
    }
}
@SuppressWarnings("unused")
class BoxTest5{
    public static void main(String[] args) {
        Box b = new Box(1,2,3);
        Box b1 = new Box(4,5,6);
        b.display();
        b1.display();
    }
}