public class Mobile{
    String mname;
    int ram;
    int rom;
    String color;
    Sim s;
    public Mobile(String mname,int ram,int rom,String color){
        this.mname=mname;
        this.ram=ram;
        this.rom=rom;
        this.color=color;
    }
    public void addSim(Sim s){
        this.s=s;
    }

    public void display(){
        System.out.println("Mobile name: "+mname);
        System.out.println("Mobile Ram: "+ram);
        System.out.println("Mobile Rom: "+rom);
        System.out.println("Mobile color: "+color);

        if(s!=null)
        System.out.println(s);
        else System.out.println("Simcard not added");
    }
}