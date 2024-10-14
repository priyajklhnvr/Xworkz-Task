public class LibraryContainer {
    public static void main(String[] args) {

        Library library = new Library();
        library.libraryName = "City Library";
        library.numberOfBooks = 400;
        library.location = "Downtown";
        library.membershipFee = 100.00;

        System.out.println("Library Name: " + library.libraryName);
        System.out.println("Number Of Books In Library: " + library.numberOfBooks);
        System.out.println("Location of the Library: " + library.location);
        System.out.println("Library Membership Fees: " + library.membershipFee);
        System.out.println("``````````````````````````````````````````````````````````");

        Library library1 = new Library();
        library1.libraryName = "University Library";
        library1.numberOfBooks = 4000;
        library1.location = "Campus";
        library1.membershipFee = 1200.00;

        System.out.println("Library Name: " + library1.libraryName);
        System.out.println("Number Of Books In Library: " + library1.numberOfBooks);
        System.out.println("Location of the Library: " + library1.location);
        System.out.println("Library Membership Fees: " + library1.membershipFee);
        System.out.println("``````````````````````````````````````````````````````````");

        Library library2 = new Library();
        library2.libraryName = "Regional Library";
        library2.numberOfBooks = 1500;
        library2.location = "Hyderabad";
        library2.membershipFee = 1750.50;

        System.out.println("Library Name: " + library2.libraryName);
        System.out.println("Number Of Books In Library: " + library2.numberOfBooks);
        System.out.println("Location of the Library: " + library2.location);
        System.out.println("Library Membership Fees: " + library2.membershipFee);

        System.out.println("``````````````````````````````````````````````````````````");

        Library library3 = new Library("State Central Library", 800, "Bangaluru", 100.0);
        Library library4 = new Library("Delhi Public Library", 750, "Delhi", 150.0);
        Library library5 = new Library("City Central Library, Mysuru", 400, "Mysore", 300.0);
        Library library6 = new Library("Community Library", 460, "Canada", 1050.0);
        Library library7 = new Library("District Central Library", 900, "Shivamogga", 1005.0);
        Library library8 = new Library("British Council Library", 1000, "Pune", 4500.0);
        Library library9 = new Library("CAsiatic Society of Mumbai Library", 1200, "Mumbai", 180.0);

        library3.LibraryDetails();
        library4.LibraryDetails();
        library5.LibraryDetails();
        library6.LibraryDetails();
        library7.LibraryDetails();
        library8.LibraryDetails();
        library9.LibraryDetails();

    }

}