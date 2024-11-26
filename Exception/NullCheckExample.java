public class NullCheckExample {
    public static void main(String[] args) {

        String cityName = null;

        if (cityName != null) {
            System.out.println("City name is: " + cityName);
            System.out.println("City name length: " + cityName.length());
            System.out.println("City in uppercase: " + cityName.toUpperCase());
        } else {
            System.err.println("City name is not available.");
        }

        String countryName = "India";

        if (countryName != null) {
            System.out.println("Country name is: " + countryName);
            System.out.println("Country name length: " + countryName.length());
            System.out.println("Country in uppercase: " + countryName.toUpperCase());
        } else {
            System.err.println("Country name is not available.");
        }
    }
}
