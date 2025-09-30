package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();

        System.out.print("What model is the phone? ");
        scanner.nextLine();
        String model = scanner.nextLine();

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        cellPhone.setSerialNumber(serialNumber);
        cellPhone.setModel(model);
        cellPhone.setCarrier(carrier);
        cellPhone.setPhoneNumber(phoneNumber);
        cellPhone.setOwner(owner);

        System.out.println(cellPhone.getSerialNumber());
        System.out.println(cellPhone.getModel());
        System.out.println(cellPhone.getCarrier());
        System.out.println(cellPhone.getPhoneNumber());
        System.out.println(cellPhone.getOwner());


    }
}
