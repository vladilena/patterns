package decorator_wrapper;


public class Printer implements PrinterInterface {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}
