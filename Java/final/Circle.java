class Circle{
    int radius;
    Circle(int r){
        radius=r;
    }
    public static void main(String[] args) {
        final Circle c1 = new Circle(45);
        System.out.println(c1.radius);
        c1.radius=12;
        System.out.println(c1.radius);
       //c1=null;
       //c1=new Circle(67);
    }
}   