package com.cejv416.inheritance02;

/**
 * Subclass of Product
 *
 * @author Ken Fogel
 */
public class Software extends Product {

    private String version;

    public Software() {
        version = "";
        // Static variable that increments every time an object is created that
        // is a subclass of Product
        count++;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Version:     " + version + "\n";
    }
}
