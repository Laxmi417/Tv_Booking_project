package tv_oops_project;

public class SmartTv extends TV {
	private String os;
    private boolean voiceControl;

    public SmartTv(String brand, String model, double price, String os, boolean voiceControl) {
      super(brand, model, price);
        this.os = os;
        this.voiceControl = voiceControl;
       // System.out.println("Smart TV booked: " + brand + " " + model + " with OS: " + os);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Operating System: " + os);
        if (voiceControl) {
            System.out.println("Voice Control: yes");
        } else {
            System.out.println("Voice Control: no");
        }
        System.out.println("Details displayed for Smart TV: " + getBrand() + " " + getModel());
    }
}
