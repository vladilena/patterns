package abstract_factory;

public class RuKeyboard implements Keyboard {
    public void print() {
        System.out.println("Печатаем");
    }

    public void println() {
        System.out.println("Печатаем с отступом");
    }
}
