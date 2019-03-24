package factory;

public class DigitalWatchMaker implements WatchMaker {
    public Watch createwatch() {
        return new DigitalWatch();
    }
}
