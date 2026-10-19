@SuppressWarnings({"ObsoleteAnnotationSupportedSource", "ObsoleteAnnotationSupportedSource"})
class Rectangle1{
    int length;
    int breadth;

    Rectangle1(int l,int b) {
        length=l;
        breadth=b;
    }

    @SuppressWarnings("unused")
    Rectangle1(Rectangle1 r) {
        length=r.length;
        breadth=r.breadth;
    }
    void display(){
        System.out.println("length="+length+"\tbreadth="+breadth);
    }
}
@SuppressWarnings("unused")
   class Rectangle{
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(2,3);
        Rectangle1 r2 = new Rectangle1(3,3);

        r1.display();
        r2.display();
    }   
   }
    
