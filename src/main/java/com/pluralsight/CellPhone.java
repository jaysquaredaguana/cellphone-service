package com.pluralsight;

public class CellPhone {

    // Data members (properties)
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Parameterless constructor
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Overloaded constructor with parameters for all properties
    public CellPhone(int serialNumber, String model, String carrier,
                     String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // Getter and setter for serialNumber
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Getter and setter for model
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter for carrier
    public String getCarrier() {
        return this.carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // Getter and setter for phoneNumber
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and setter for owner
    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s%n", getOwner(), phoneNumber);
    }

    public void dial(CellPhone phone) {
        System.out.printf("%s's phone is calling %s%n", getOwner(), phone.getPhoneNumber());
    }
}
