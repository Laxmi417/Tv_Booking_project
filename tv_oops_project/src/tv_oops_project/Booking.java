package tv_oops_project;

import tv_oops_project.TV;

public class Booking {
	 private TV tv;
	    private String customerName;

	    public Booking(TV tv, String customerName) {
	        this.tv = tv;
	        this.customerName = customerName;
	        System.out.println("Booking done for customer: " + customerName + " with TV: " + tv.getBrand() + " " + tv.getModel());
	    }

	    public void displayBookingDetails() {
	        System.out.println("Booking Details:");
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("TV Details:");
	        tv.displayDetails();
	        System.out.println("Booking details displayed for customer: " + customerName);
	    }
}


