public class ReturnTypeExample {
    public static void main(String[] args) {

        String retunedString = getGreeting();
        System.out.println(retunedString);

        System.out.println(getByteValue());

        float temperature = getTemperature();
        System.out.println("Current temperature: " + temperature + "°C");

        double piValue = getPiValue();
        System.out.println("Pi Value: " + piValue);

        System.out.println(checkEven());

        System.out.println(myMethod());

        char grade = getGrade();
        System.out.println("You Get The Grade : " + grade);

        long distance = getDistanceToMoon();
        System.out.println("Distance to Moon: " + distance + " KM");

    }

    public static String getGreeting() {
        return "Hey! I am Priya";
    }

    public static byte getByteValue() {
        System.out.println("Declaring The byte value");
        byte value = 42;
        System.out.println("Returning a Byte value");
        return value;

    }

    public static float getTemperature() {

        float temperature = 25.5f;
        System.out.println("Returns the temperature value");
        return temperature;
    }

    public static double getPiValue() {
        return 3.14159;
    }

    public static boolean checkEven() {
        int value = 1;
        if (value == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static char getFirstLetter() {
        return 'A';
    }

    public static int myMethod() {
        int x = 4;
        return 5 + x;
    }

    public static char getGrade() {
        System.out.println("Your Grade.....?");
        return 'A';
    }

    public static long getDistanceToMoon() {
        return 238855L;
    }
}
