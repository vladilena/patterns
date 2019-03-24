package builder;

public class Director {
    CarBulder builder;

    void setBuilder(CarBulder b) {
        builder = b;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildMark();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();
        return car;
    }
}
