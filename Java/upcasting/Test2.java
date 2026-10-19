class Animal1{
    void makeSound(){
        System.out.println("makesound() is animal");
    }
}
class Dog extends Animal1{
    void makeSound(){
        System.out.println("bow");
    }
}
class Cat extends Animal1{
    void makeSound(){
        System.out.println("meow");
    }
}
class Zoo{
    void cage(Animal1 a){
        a.makeSound();
    }
}
@SuppressWarnings("unused")
class Test2{
    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.cage(new Dog());
        z.cage(new Cat());

        
    }
}