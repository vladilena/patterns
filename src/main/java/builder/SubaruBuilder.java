package builder;

public class SubaruBuilder extends CarBulder {
    void buildMark() {
        car.setMark("Subaru");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(250);
    }
}
