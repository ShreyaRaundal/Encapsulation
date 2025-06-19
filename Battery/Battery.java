package Battery;

public class Battery {
    private String brand;
    private double price;
    private int capacity;
    private String type;

    public Battery(String brand, double price, int capacity, String type) {
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
        this.type=type;
    }

    public void settype(String type) {
        if (type.equalsIgnoreCase("Li-ion") || type.equalsIgnoreCase("NiMH")) {
            this.type = type;
        } else {
            System.out.println("Invalid battery type.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public String gettype() {
        return type;
    }

    public void displayInfo() {
        System.out.println("Battery Info:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " mAh");
        System.out.println("Price: ₹" + price);
    }
}

