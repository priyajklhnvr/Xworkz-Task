public class PowerBank {

    int capacity;
    String Name;
    String BrandName;
    String color;
    Double price;

    public PowerBank() {
        System.out.println("No parameter Constroctors");

    }

    public PowerBank(int capacity, String Name) {
        this();
        this.capacity = capacity;
        this.Name = Name;

    }

    public PowerBank(int capacity, String Name, String BrandName) {
        this(capacity, Name);
        this.BrandName = BrandName;
    }

    public PowerBank(int capacity, String Name, String BrandName, String color) {
        this(capacity, Name, BrandName);
        this.color = color;
    }

    public PowerBank(int capacity, String Name, String BrandName, String color, Double price) {
        this(capacity, Name, BrandName, color);
        this.price = price;

    }

    public void displayInfo() {
        System.out.println("Power Bank Name: " + Name);
        System.out.println("Brand: " + BrandName);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);

    }

}
