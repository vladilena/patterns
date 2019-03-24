package abstract_factory;

class Main {
    public static void main(String[] args) {
        DeviceFactory device = getFactoryByCountryCode("Ru");
        Keyboard k = device.getKeyboard();
        Mouse m = device.getMouse();
        Touchpad t = device.getTouchpad();
k.print();
m.dblclick();
m.scroll(12);
t.track(12,-4);

    }

    public static DeviceFactory getFactoryByCountryCode(String code) {
        if (code.equals("Ru")) {
            return new RuDeviceFactory();
        } else if (code.equals("En")) {
            return new EnDeviceFactory();
        } else throw new RuntimeException("There are no such code");
    }
}
