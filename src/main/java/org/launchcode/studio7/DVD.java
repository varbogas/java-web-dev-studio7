package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    public boolean playsVideo(){
        return true;
    }

    public DVD(String name, String contents, double capacity, String diskType) {
        super(name, contents, capacity, diskType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void writeData() {
        System.out.println(name + " writes to a DVD.");
    }

    @Override
    public void storeData() {
        System.out.println(name + " stores to a DVD.");
    }

    @Override
    public void readData() {
        System.out.println(name + " reads to a DVD.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
