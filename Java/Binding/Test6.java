class Animal{
    void m1(){
        System.out.println("class Animal");
    }
}
class Dog extends Animal{

}
class Labrador extends Dog{

}
class Test6{
    public static void main(String[] args) {
        Animal a1 = new Labrador();
        Dog d1 = (Dog)a1;
        Labrador l1 = (Labrador)a1;
    }
}