public class PersonDriver{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("Ram", 22, 1, new Address("Hyd","Indian"));
        //System.out.println(p1);
        Person p2 = (Person) p1.clone();
        p1.address.city="Banglore";
        System.out.println(p1);
        System.out.println(p2);

       Person p3 = new Person("Siva",22,12312, new Address("Hyd","India"));
       System.out.println(p3); 
       p3.address.city="Kadapa";
       System.out.println(p3);

       p3.id=12002;
       System.out.println(p3);

    }
}