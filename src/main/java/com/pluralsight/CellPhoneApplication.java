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

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setOwner("Duy");
        cellPhone2.setModel("Iphone 16");
        cellPhone2.setCarrier("Verizon");
        cellPhone2.setPhoneNumber("123-456-7890");
        cellPhone2.setSerialNumber(39847543);
        display(cellPhone);
        display(cellPhone2);

        cellPhone.dial(cellPhone2.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}
