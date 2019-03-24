package delegate;

class Main {
    public static void main(String[] args) {
//A a = new A();
//a.f();

        Painter painter = new Painter();
        painter.setGrafics(new Circle());
        painter.draw();

        painter.setGrafics(new Square());
        painter.draw();

        painter.setGrafics(new Triangle());
        painter.draw();

    }
}
