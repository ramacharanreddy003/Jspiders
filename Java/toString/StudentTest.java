class Student{
    int rollnum;
    String name;
    
    public Student(int rollnum,String name){
        super();
        this.rollnum=rollnum;
        this.name=name;
    }
    @Override
    public String toString(){
        return rollnum+" : "+name;
    }
}
@SuppressWarnings("unused")
class StudentTest{
    public static void main(String[] args) {
        Student s = new Student(101,"Charan");
        System.out.println(s);
        Student s2 = new Student(102,"Venu");
        System.out.println(s2);
    }

}