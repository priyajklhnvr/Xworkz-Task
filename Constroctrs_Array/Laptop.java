public class Laptop {
    String brand;
    int ram;
    int storage;
    String model;

    public Laptop(String brand, int ram, int storage, String model) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.model = model;

    }

    public void turnOn() {

    }

    public void turnOff() {

    }

    public void laptopDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Laptop Ram: " + ram);
        System.out.println("Laptop Storage: " + storage);
        System.out.println("Laptop Model: " + model);
    }
}
