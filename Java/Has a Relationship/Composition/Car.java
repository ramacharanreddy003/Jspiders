public class Car{
    String name;
    int num;
    String color;
    Engine e;
    public Car(String name,int num,String color,Engine e){
        this.name=name;
        this.num=num;
        this.color=color;
        this.e=e;
    }
    @Override
    public String toString(){
        return "Car [name ="+name+", num= "+num+",color="+color+","+e+"]";
    }
}