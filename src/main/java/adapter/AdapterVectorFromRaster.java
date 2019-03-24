package adapter;

public class AdapterVectorFromRaster extends RasterGrafics implements VectorGraphics {
    public void drawLine() {
        drawRasterLine();
    }

    public void drawSquare() {
        drawRasterSquare();
    }
}
