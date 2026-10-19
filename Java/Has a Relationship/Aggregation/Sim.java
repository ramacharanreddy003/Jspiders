public class Sim{
    String name;
    long num;
    public Sim(String name,long num){
        this.name=name;
        this.num=num;
    }

    @Override
    public String toString(){
        return "Sim [name="+name+", num="+num+"]";
    }
}