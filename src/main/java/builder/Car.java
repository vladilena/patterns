package builder;
class Car {
    String mark;
    Transmission transmission;
    int maxSpeed;

     void setMark (String mark) {
        this.mark = mark;
    }

     void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

     void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
