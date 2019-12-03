package org.launchcode.studio7;

public class BaseDisc {
    String name;
    String contents;
    double capacity;
    String diskType;

    public BaseDisc(String name, String contents, double capacity, String diskType) {
        this.name = name;
        this.contents = contents;
        this.capacity = capacity;
        this.diskType = diskType;
    }

    public String getName() {
        return name;
    }

    public String getContents() {
        return contents;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getDiskType() {
        return diskType;
    }
}
