package abstract_factory;

public class EnMouse implements Mouse {
    public void click() {
        System.out.println("Click");
    }

    public void dblclick() {
        System.out.println("Double click");
    }

    public void scroll(int direction) {
        if(direction>0){
            System.out.println("Scroll up");
        }else if (direction<0){
            System.out.println("Scroll down");
        }else {
            System.out.println("Not scrolling");
        }

    }
}
