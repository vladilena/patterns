package builder;

abstract class CarBulder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMark();

    abstract void buildTransmission();

    abstract void buildMaxSpeed();

    Car getCar (){
        return car;
    }
}
