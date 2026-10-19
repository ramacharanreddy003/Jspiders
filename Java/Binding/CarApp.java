


class Car {

    void start() {

    }

    void accelerate() {

    }

    void stop() {

    }
}

@SuppressWarnings("unused")
class BMW extends Car {

    @Override
    void start() {
        System.out.println("Button starts");
    }

    @Override
    void accelerate() {
        System.out.println("half clutch");
    }

    @Override
    void stop() {
        System.out.println("key stop");
    }
}

@SuppressWarnings("unused")
class Audi extends Car {

    @Override
    void start() {
        System.out.println("Key start");
    }

    @Override
    void accelerate() {
        System.out.println("Half clutch");
    }

    @Override
    void stop(){
        System.out.println("Key stop");
    }
}

class Maruti extends Car{
    
    @Override
    void start(){
        System.out.println("Maruti start");
    }
    @Override
    void accelerate(){
        System.out.println("Maruti accelerate");
    }
    @Override
    void stop(){
        System.out.println("MAruti stop");
    }
}

@SuppressWarnings("unused")
class Driver{
    void drive(Car car){
        car.start();;
        car.accelerate();
        car.stop();
    }
}
@SuppressWarnings("unused")
class CarApp{
    public static void main(String[] args) {
        Driver d1 = new Driver();
        d1.drive(new BMW());
        d1.drive(new Audi());
        d1.drive(new Maruti());
    }
}