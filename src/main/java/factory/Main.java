package factory;
class Main {
    public static void main(String[] args) {
WatchMaker maker = getMakerByName("Digital");//new RomeWatchMaker();//new DigitalWatchMaker();
Watch watch = maker.createwatch();
watch.showTime();
    }
    public static WatchMaker getMakerByName (String maker){
if (maker.equals("Digital")){
    return new DigitalWatchMaker();
}else if (maker.equals("Rome")){
    return new RomeWatchMaker();
}
    throw  new RuntimeException("Not supported");}
}
