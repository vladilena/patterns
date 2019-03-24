package factory;

public class RomeWatchMaker implements WatchMaker {
    public Watch createwatch() {
        return new RomeWatch();
    }
}
