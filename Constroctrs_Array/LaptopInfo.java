public class LaptopInfo {

    static Laptop[] laptopsData = new Laptop[7];

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Dell", 8, 512, "Inspiron 15");
        Laptop laptop2 = new Laptop("HP", 16, 1024, "Pavilion x360");
        Laptop laptop3 = new Laptop("Lenovo", 4, 256, "ThinkPad E14");
        Laptop laptop4 = new Laptop("Apple", 8, 512, "MacBook Air");
        Laptop laptop5 = new Laptop("Asus", 12, 512, "ZenBook Pro");
        Laptop laptop6 = new Laptop("Acer", 16, 1024, "Aspire 7");
        Laptop laptop7 = new Laptop("MSI", 32, 2048, "Prestige 14");

        SaleLaptop(laptop1);
        SaleLaptop(laptop2);
        SaleLaptop(laptop3);
        SaleLaptop(laptop4);
        SaleLaptop(laptop5);
        SaleLaptop(laptop6);
        SaleLaptop(laptop7);
        System.out.println("`````````````````````````````````````````````````");

        Laptop foundLaptop = findName("HP");
        if (foundLaptop != null) {
            foundLaptop.laptopDetails();

        }
        System.out.println("`````````````````````````````````````````````````");
        Laptop foundLaptop1 = findName("Apple");
        if (foundLaptop1 != null) {
            foundLaptop1.laptopDetails();

        }
        System.out.println("`````````````````````````````````````````````````");

        updatePriceByBrandName("Dell", 16);

        System.out.println("RAM updated successfully.");

        for (int i = 0; i < laptopsData.length; i++) {
            if (laptopsData[i] != null) {
                laptopsData[i].laptopDetails();
            }

        }

    }

    public static boolean SaleLaptop(Laptop laptop) {

        for (int i = 0; i < laptopsData.length; i++) {
            if (laptopsData[i] == null) {
                laptopsData[i] = laptop;
                System.out.println("laptop is saved");
                return true;
            }
        }
        System.out.println("No space in array");
        return false;

    }

    public static Laptop findName(String brand) {

        for (int i = 0; i < laptopsData.length; i++) {
            if (laptopsData[i].brand.equals(brand)) {
                System.out.println("laptop found");
                return laptopsData[i];

            }
        }
        System.out.println("Brand Name not found in array");
        return null;

    }

    public static boolean updatePriceByBrandName(String brandName, int ram) {

        for (int i = 0; i < laptopsData.length; i++) {
            if (laptopsData[i] != null) {
                laptopsData[i].ram = ram;
                System.out.println("Ram Updated");
                return true;
            }
        }

        System.out.println("Brand Name not found,update failed");
        System.out.println("``````````````````````````````````````````");
        return false;

    }
}
