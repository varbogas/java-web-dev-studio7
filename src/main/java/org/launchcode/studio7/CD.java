package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {
    public boolean playsAudio(){
        return true;
    }

    public CD(String name, String contents, double capacity, String diskType) {
        super(name, contents, capacity, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println(name + " writes to a CD.");
    }

    @Override
    public void storeData() {
        System.out.println(name + " stores to a CD.");
    }

    @Override
    public void readData() {
        System.out.println(name + " reads to a CD.");

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
