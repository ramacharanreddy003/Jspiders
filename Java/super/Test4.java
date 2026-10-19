class Person {
    String name;
    Person(String n) {
        name = n;
    }
}
class Teacher extends Person {
    String sub;
    Teacher(String n, String s) {
        super(n);
        sub = s;
    }
}

@SuppressWarnings("unused")
class Test4 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Siva", "Java");
        System.out.println("Name= " + t1.name + ", " + "Sub= " + t1.sub);

    }
}
