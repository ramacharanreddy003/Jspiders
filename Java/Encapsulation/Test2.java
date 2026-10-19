class Teacher{
    private String Teacher_name;
    private int age;
    private String subject;

    public String getTName(){
        return Teacher_name;
    }
    public void setTName(String Teacher_name){
        this.Teacher_name=Teacher_name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setTName("Charan");
        t.setAge(22);
        t.setSubject("Java");
        System.out.println(t.getTName());
        System.out.println(t.getAge());
        System.out.println(t.getSubject());


    }
}