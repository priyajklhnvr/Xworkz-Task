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
}
