package abstract_factory;

public class RuMouse implements  Mouse {
    public void click() {
        System.out.println("Щелчок");
    }

    public void dblclick() {
        System.out.println("Двойной щелчок");
    }

    public void scroll(int direction) {
if(direction>0){
    System.out.println("Скроллим вверх");
}else if (direction<0){
    System.out.println("Скроллим вниз");
}else {
    System.out.println("не скроллим");
}
    }
}
