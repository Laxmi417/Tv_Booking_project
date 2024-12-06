package tv_oops_project;

public class TV {
	private String brand;
    private String model;
    private double price;

    public TV(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
     // System.out.println("TV booked: " + brand + " " + model + " priced at " + price);
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Details displayed for TV: " + brand + " " + model);
    }

    public double getPrice() {
        System.out.println("Price accessed for TV: " + brand + " " + model);
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
    	return model;
    }
}

