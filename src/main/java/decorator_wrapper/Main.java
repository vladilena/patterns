package decorator_wrapper;

class Main {
    public static void main(String[] args) {
        PrinterInterface printer = new QuoteDecorator(new Printer("Hello"));

        PrinterInterface printer2 = new QuoteDecorator(new LeftBracketDecorator(new RightBracketDecorator(new Printer("Hello"))));

        printer.print();
        System.out.println("\n");
        printer2.print();
    }
}
