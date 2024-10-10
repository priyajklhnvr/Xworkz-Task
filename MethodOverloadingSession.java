public class MethodOverloadingSession {

    public static void main(String[] args) {
        updateDetails("Priya");
        updateDetails(23, "Priya");
        updateDetails("Priya", 98776545, "priya123@gmail.com");

        addProduct("mobile", 25000);
        addProduct(20000, 10);
        addProduct("mobile", "Electronics", 25000, 10);

        createAccount("Priya", "savings");
        createAccount("Priya");
        createAccount("Savings", 15000, "Priya123@gmail.com");

        System.out.println("Sum of all the numbers: " + sum(25, 20, 10, 15, 18, 5, 7));
    }

    public static void updateDetails(String name) {
        System.out.println("Name: " + name);
    }

    public static void updateDetails(int age, String name) {
        System.out.println("My Name is " + name + " I am " + age + " Years Old.");
    }

    public static void updateDetails(String name, int number, String email) {
        System.out.println("My name is " + name + ", Contact No: " + number + ", My email ID is " + email);
    }

    public static void addProduct(String productName, int price) {
        System.out.println("Product name: " + productName + ", Price: Rs. " + price);
    }

    public static void addProduct(int price, int quantity) {
        System.out.println("Product quantity: " + quantity + ", Price: Rs. " + price);
    }

    public static void addProduct(String productName, String category, float price, int quantity) {
        System.out.println("Product name: " + productName + ", Category: " + category + ", Price: Rs. " + price
                + ", Quantity: " + quantity);
    }

    public static void createAccount(String holderName) {
        System.out.println("Account Holder Name: " + holderName);
    }

    public static void createAccount(String holderName, String accountType) {
        System.out.println("Account created for: " + holderName + ", Account type: " + accountType);
    }

    public static void createAccount(String accountType, int initialDeposit, String email) {
        System.out.println(
                "Account type: " + accountType + ", Initial deposit: Rs. " + initialDeposit + ", Email: " + email);
    }

    public static int sum(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;

    }
}
