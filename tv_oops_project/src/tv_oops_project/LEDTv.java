package tv_oops_project;

public class LEDTv  extends TV{
	private int screenSize;
    private String resolution;

    public LEDTv(String brand, String model, double price, int screenSize, String resolution) {
        super(brand, model, price);
        if (screenSize <= 0) {
           // System.out.println("Error: Invalid screen size provided. Size must be greater than 0.");
        } else {
            this.screenSize = screenSize;
            this.resolution = resolution;
           // System.out.println("LED TV booked: " + brand + " " + model + " with screen size: " + screenSize + " inches.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Details displayed for LED TV: " + getBrand() + " " + getModel());
    }
}


