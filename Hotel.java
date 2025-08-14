package hotelmanagement;

import java.io.*;
import java.util.Scanner;

class Hotel {
    static Holder hotel_ob = new Holder();
    static Scanner sc = new Scanner(System.in);

    static void bookroom(int i, int rn) {
        String name, contact, gender;
        String name2 = null, contact2 = null, gender2 = null;

        System.out.println("\nEnter customer name:");
        name = sc.next();
        System.out.println("Enter contact number:");
        contact = sc.next();
        System.out.println("Enter gender:");
        gender = sc.next();

        if (i < 3) { // Single room
            hotel_ob.luxury_singleerrom[rn] = new Singleroom(name, contact, gender);
        } else if (i < 5) { // Double room
            System.out.println("Enter second customer name:");
            name2 = sc.next();
            System.out.println("Enter contact number:");
            contact2 = sc.next();
            System.out.println("Enter gender:");
            gender2 = sc.next();
            hotel_ob.luxury_doublerrom[rn] = new Doubleroom(name, contact, gender, name2, contact2, gender2);
        }
        System.out.println("Room Booked Successfully!");
    }

    static void order(int rn, int roomType) {
        int itemno, quantity;
        char wish;
        do {
            System.out.println("Enter item number (1-4):");
            itemno = sc.nextInt();
            System.out.println("Enter quantity:");
            quantity = sc.nextInt();
            Food f = new Food(itemno, quantity);

            if (roomType == 1)
                hotel_ob.luxury_singleerrom[rn].food.add(f);
            else if (roomType == 2)
                hotel_ob.luxury_doublerrom[rn].food.add(f);

            System.out.println("Do you want to order anything else? (y/n)");
            wish = sc.next().charAt(0);
        } while (wish == 'y' || wish == 'Y');
    }

    static void start() {
        int ch;
        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Display room details");
            System.out.println("2. Book room");
            System.out.println("3. Order food");
            System.out.println("0. Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Room details functionality...");
                    break;
                case 2:
                    System.out.println("Booking functionality...");
                    break;
                case 3:
                    System.out.println("Ordering functionality...");
                    break;
            }
        } while (ch != 0);
    }
}
