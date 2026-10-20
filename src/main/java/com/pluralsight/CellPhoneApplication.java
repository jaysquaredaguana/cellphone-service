package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Create a CellPhone object with default values
        CellPhone cellPhone1 = new CellPhone();

        // Prompt the user for phone information
        System.out.print("What is the serial number? ");
        cellPhone1.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone1.setModel(read.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone1.setCarrier(read.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone1.setPhoneNumber(read.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone1.setOwner(read.nextLine());



        CellPhone cellPhone2 = new CellPhone();

        // Prompt the user for phone information
        System.out.print("What is the serial number? ");
        cellPhone2.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.print("What model is the phone? ");
        cellPhone2.setModel(read.nextLine());

        System.out.print("Who is the carrier? ");
        cellPhone2.setCarrier(read.nextLine());

        System.out.print("What is the phone number? ");
        cellPhone2.setPhoneNumber(read.nextLine());

        System.out.print("Who is the owner of the phone? ");
        cellPhone2.setOwner(read.nextLine());

        display(cellPhone1);
        display(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        read.close();
    }

    public static void display(CellPhone phone) {
        // Display the phone information using getters
        System.out.println();
        System.out.println("Cell Phone Information");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
