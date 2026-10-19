class Student{
    private String name;
    private int age;
    private int marks;

    public String getName(){
        return name;

    }    
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
}
@SuppressWarnings("unused")
class Test1{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ram");
        System.out.println(s1.getName());
        s1.setAge(22);
        System.out.println(s1.getAge());
        s1.setMarks(49);
        System.out.println(s1.getMarks());
    }
}