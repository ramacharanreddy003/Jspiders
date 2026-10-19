class Bike{
    void start(){
        System.out.println("start() in bike");
    }
}
class Pulsar extends Bike{
    void start(){
        System.out.println("start() in pulsar");
    }
}
class Rider{
    void ride(Bike b){
        System.out.println("ride(bike) in rider");
        b.start();
    }

    void ride(Pulsar p){
        System.out.println("ride(pulsar) in rider");
        p.start();
    }
}
class Prorider extends Rider{
    @SuppressWarnings("override")
    void ride(Bike b){
        System.out.println("ride(bike) in prorider");
        b.start();
    }
    @Override
    void ride(Pulsar p){
        System.out.println("ride(Pulsar) in prorider");
        p.start();
    }
}
@SuppressWarnings("unused")
class Test4{
    public static void main(String[] args) {
        Rider r = new Prorider();
        Bike b = new Pulsar();
        r.ride(b);
    }
}