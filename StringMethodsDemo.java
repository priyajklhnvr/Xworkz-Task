public class StringMethodsDemo {
    public static void main(String[] args) {

        String Greeting = "hello priya";
        System.out.println("Uppercase: " + Greeting.toUpperCase());

        String Car = "BMW";
        System.out.println("Lowercase: " + Car.toLowerCase());

        String Language = "Java";
        System.out.println("Character at index 1: " + Language.charAt(1));

        String institute = "Xworkz in BTM";
        System.out.println("Length: " + institute.length());

        String Fruits = "Apple";
        String Fruits1 = "Banana";
        System.out.println("Equals: " + Fruits.equals(Fruits1));

        String destination = "Japan";
        System.out.println("Replace Letters: " + destination.replace('p', 'v'));

        String Mobile = "   Vivo   ";
        System.out.println("Trimmed: " + Mobile.trim());

        String Laptop = "Lenovo HP Dell";
        String[] laptopBrands = Laptop.split(" ");
        System.out.println(laptopBrands[0]);
        System.out.println(laptopBrands[1]);
        System.out.println(laptopBrands[2]);

        String Company = "JP Morgan";
        System.out.println("Starts with 'JP': " + Company.startsWith("JP"));

        System.out.println("Ends with 'World': " + Company.endsWith("World"));

        String data = "refer";
        String reversedStr = "";

        for (int i = data.length() - 1; i >= 0; i--) {
            reversedStr += data.charAt(i);
        }

        if (data.equals(reversedStr)) {
            System.out.println(data + " is a palindrome.");
        } else {
            System.out.println(data + " is not a palindrome.");
        }

        int[] values = { 15, 55, 18, 2, 150, 8, 25, 48, 1 };
        int smallestElement = values[0];
        int secondSmallestElement = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallestElement) {
                secondSmallestElement = smallestElement;
                smallestElement = values[i];
            } else if (values[i] < secondSmallestElement) {
                secondSmallestElement = values[i];

            }
        }

        System.out.println(secondSmallestElement);

    }
}
