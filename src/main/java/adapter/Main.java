package adapter;

class Main {
    public static void main(String[] args) {

//Inheritance
        VectorGraphics vg = new AdapterVectorFromRaster();
        vg.drawLine();
        vg.drawSquare();

//Composition
        VectorGraphics vg2 = new AdapterVectorFromRasterComposition();
        vg2.drawLine();
        vg2.drawSquare();
    }
}