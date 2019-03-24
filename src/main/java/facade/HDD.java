package facade;

class HDD {
    void copyFromDVD (DVDRom rom){
        if (rom.hasData()){
            System.out.println("data downloading");
        }else {
            System.out.println("provide disc with data");
        }
    }
}
