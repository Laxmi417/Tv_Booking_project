package tv_oops_project;

import java.util.Scanner;

import tv_oops_project.Booking;
import  tv_oops_project.LEDTv;
import tv_oops_project.SmartTv;
import tv_oops_project.TV;

public class Controller {
	public static void main(String[] args) {

        TV basicTV = new TV("Sony", "Basic123", 299.99);
        SmartTv smartTV = new SmartTv("Samsung", "SmartPro", 799.99, "Android", true);
        LEDTv ledTV = new LEDTv("LG", "LED789", 499.99, 55, "4K");

    
        System.out.println("Available TVs:");
        System.out.println("1. Basic TV");
        basicTV.displayDetails();

        System.out.println("\n2. Smart TV");
        smartTV.displayDetails();

        System.out.println("\n3. LED TV");
        ledTV.displayDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the number of the TV you want to book (1, 2, or 3):");
        int choice = scanner.nextInt();
       
    

        TV selectedTV = null;
        switch (choice) {
            case 1:
                selectedTV = basicTV;
                break;
            case 2:
                selectedTV = smartTV;
                break;
            case 3:
                selectedTV = ledTV;
                break;
            default:
                System.out.println("Invalid choice. No booking made.");
         }
        System.out.println("You selected: " + selectedTV.getBrand() + " " + selectedTV.getModel());
        System.out.println("Do you want to confirm the booking? (yes/no):");
        String response = scanner.next();

        if (response.equals("yes")) {
            System.out.println("Enter your name for the booking:");
            String customerName = scanner.next();
            Booking booking = new Booking(selectedTV, customerName);
           
            booking.displayBookingDetails();
        } 
   }

}
