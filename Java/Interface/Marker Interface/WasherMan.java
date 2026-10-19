interface Washable{

}
class Bike implements Washable{}
class Car implements Washable{}
class Mobile{}
class Laptop{}
public class WasherMan{
    public static void Wash(Object o){
        if(o instanceof Washable){
            System.out.println(o.getClass().getSimpleName()+" is washed");
        }else{
            System.out.println(o.getClass().getSimpleName()+" is Not washed");
        }
    }
        public static void main(String[] args){
            Wash(new Bike());
            Wash(new Car());
            Wash(new Laptop());
            Wash(new Mobile());
        }
    
}