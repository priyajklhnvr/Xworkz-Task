public class MethodParameter {

    public static void email(String emailId, String subject) {
        System.out.println("An Mesage has been sent to " + emailId + " with the small reminder '" + subject + "'.");
    }

    public static void phoneCall(String mobNum, String name, String countryCode) {
        System.out.println("Dialing " + countryCode + " " + mobNum + " to reach " + name + ".");

    }

    public static void login(String email, String password) {
        System.out.println(
                "Attempting to login with the emailID: " + email + " and the provided password is " + password + ".");
    }

    public static void main(String[] args) {
        // Invoking the email method three times
        email("priya123@gmail.com", "Project Update");
        email("xworkzBTM@gmail.com", "MMonthly Report submission");
        email("priya2001@gmail.com", "Task submission");

        System.out.println();

        // Invoking the phoneCall method three times
        phoneCall("9876543210", "Ramya", "+91");
        phoneCall("9123456789", "Navya", "+91");
        phoneCall("9988776655", "Divya", "+44");

        System.out.println();

        // Invoking the login method three times
        login("user1@example.com", "123BTM");
        login("user2@example.com", "Priya2001");
        login("user3@example.com", "xworkzodcbtm");
    }
}
