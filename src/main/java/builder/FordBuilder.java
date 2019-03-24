package builder;

class FordBuilder extends CarBulder {

    void buildMark() {
        car.setMark("Ford");
    }

    void buildTransmission() {
car.setTransmission(Transmission.AUTO);
    }

    void buildMaxSpeed() {
car.setMaxSpeed(150);
    }
}
