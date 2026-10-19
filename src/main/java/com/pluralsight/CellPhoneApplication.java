package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        // Create a CellPhone object with default values
        CellPhone phone = new CellPhone();

        // Prompt the user for phone information
        System.out.print("What is the serial number? ");
        phone.setSerialNumber(read.nextInt());
        read.nextLine();

        System.out.print("What model is the phone? ");
        phone.setModel(read.nextLine());

        System.out.print("Who is the carrier? ");
        phone.setCarrier(read.nextLine());

        System.out.print("What is the phone number? ");
        phone.setPhoneNumber(read.nextLine());

        System.out.print("Who is the owner of the phone? ");
        phone.setOwner(read.nextLine());

        // Display the phone information using getters
        System.out.println();
        System.out.println("Cell Phone Information");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        read.close();
    }
}
