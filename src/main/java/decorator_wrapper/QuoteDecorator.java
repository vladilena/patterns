package decorator_wrapper;

public class QuoteDecorator extends Decorator {

    public QuoteDecorator(PrinterInterface component) {
        super(component);
    }
    public void print() {
        System.out.print("\"");
        component.print();
        System.out.print("\"");
    }
}
