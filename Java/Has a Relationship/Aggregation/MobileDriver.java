public class MobileDriver{
    public static void main(String[] args) {
        Mobile m  = new Mobile("Realme",6,128,"black");
        m.addSim(new Sim("Jio",9082912321L));
        m.s.name="Jio";
        m.display();

    }
}