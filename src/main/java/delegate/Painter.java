package delegate;

public class Painter {
    Grafics grafic;
    void setGrafics (Grafics g){
        grafic = g;
    }
    void draw(){
        grafic.draw();
    }
}
