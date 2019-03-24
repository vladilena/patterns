package builder;

class Main {
    public static void main(String[] args) {
//Car car = new FordBuilder().buildMark("Audi")
//        .buildTransmission(Transmission.MANUAL)
//        .buildMaxSpeed(150)
//        .build();
//        System.out.println(car);
//
//        Car car2 = new FordBuilder()
//                .buildTransmission(Transmission.MANUAL)
//                .buildMaxSpeed(200)
//                .build();
//
//        System.out.println(car2);

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }

}
