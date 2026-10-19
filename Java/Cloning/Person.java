

public class Person implements Cloneable{
    String name;
    int age;
    int id;
    Address address;

    public Person(String name,int age,int id,Address address){
        this.name=name;
        this.age=age;
        this.id=id;
        this.address=address;

    }

    @Override
    public String toString(){
        return "Person [name="+name+", age="+age+", id="+id+", address= "+address+"]";
    }
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        Person p =  (Person)super.clone();
        p.address=(Address) address.clone();
        return p;
    }
}