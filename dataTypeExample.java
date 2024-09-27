public class dataTypeExample {
    public static void main(String[] args) {
        byte studentAge = 15;
        byte monthOfYear = 12;
        byte maxTemperature = 35;
        byte minTemperature = 18;
        byte dailyAttendance = 100;
        byte hoursInDay = 24;
        byte numberOfSeats = 120;
        byte numberOfSubjects = 8;

        short populationOfTown = 15000;
        short numberOfEmployees = 5000;
        short yearlyRevenue = 32000;
        short distanceInMiles = 400;
        short stockQuantity = 2000;
        short salaryPerMonth = 15000;
        short costOfEquipment = 7000;
        short yearlyProduction = 25000;

        // // Output the values
        System.out.println("Student Age: " + studentAge);
        System.out.println("Month of the Year: " + monthOfYear);
        System.out.println("Max Temperature: " + maxTemperature);
        System.out.println("Min Temperature: " + minTemperature);
        System.out.println("Daily Attendance: " + dailyAttendance);
        System.out.println("Hours in a Day: " + hoursInDay);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Number of Subjects: " + numberOfSubjects);
        System.out.println("--------------------------------------------");
        System.out.println("This output for short!!!!");
        System.out.println("--------------------------------------------");

        System.out.println("Population of Town: " + populationOfTown);
        System.out.println("Number of Employees: " + numberOfEmployees);
        System.out.println("Yearly Revenue: " + yearlyRevenue);
        System.out.println("Distance in Miles: " + distanceInMiles);
        System.out.println("Reassign the value of DistanceInMile(Before it is 400,now 500)..............");
        distanceInMiles = 500;
        System.out.println("Distance in Miles: " + distanceInMiles);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Salary Per Month: " + salaryPerMonth);
        System.out.println("Cost of Equipment: " + costOfEquipment);
        System.out.println("Yearly Production: " + yearlyProduction);
    }
}
