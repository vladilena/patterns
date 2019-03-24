package facade;

public class Computer {
    //facade class
Power power = new Power();
DVDRom dvd = new DVDRom();
HDD hdd = new HDD();
    void copy (){
power.on();
dvd.load();
hdd.copyFromDVD(dvd);
    }
}
