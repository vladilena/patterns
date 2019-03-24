package abstract_factory;

public class RuTouchpad implements Touchpad {
    public void track(int deltax, int deltaY) {
        int s = (int) Math.sqrt(Math.pow(deltax,2)+Math.pow(deltaY,2));
        System.out.println("Передвинулись на "+s+"пикселей");
    }
}
