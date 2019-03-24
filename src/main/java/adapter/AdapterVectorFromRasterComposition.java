package adapter;

public class AdapterVectorFromRasterComposition implements VectorGraphics {
    RasterGrafics rg = new RasterGrafics();

    public void drawLine() {
        rg.drawRasterLine();
    }

    public void drawSquare() {
        rg.drawRasterSquare();
    }
}
