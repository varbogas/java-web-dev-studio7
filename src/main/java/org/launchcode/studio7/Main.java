package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd1;
        DVD dvd1;

        // TODO: Declare and initialize a CD and a DVD object.
        cd1 = new CD("Mika", "GreatestGreatest Hits", 10, "music");
        dvd1 = new DVD("Pride and Prejudice", "100th Anniversary Edition", 12, "dvd");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd1.spinDisc();
        cd1.writeData();
        cd1.storeData();
        cd1.readData();
        dvd1.spinDisc();
        dvd1.writeData();
        dvd1.storeData();
        dvd1.readData();
    }
}
