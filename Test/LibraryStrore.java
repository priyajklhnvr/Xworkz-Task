public class LibraryStrore {
    public static void main(String[] args) {

        Library library0 = new Library();
        library0.libraryName = "City Center Library";
        library0.numberOfBooks = 400;
        library0.location = "Bangaluru";
        library0.membershipFee = 800.00;

        System.out.println("Library Name: " + library0.libraryName);
        System.out.println("Number Of Books In Library: " + library0.numberOfBooks);
        System.out.println("Location of the Library: " + library0.location);
        System.out.println("Library Membership Fees: " + library0.membershipFee);

        Library library1 = new Library();
        library1.libraryName = "University Library";
        library1.numberOfBooks = 4000;
        library1.location = "Pune";
        library1.membershipFee = 1600.00;

        System.out.println("Library Name: " + library1.libraryName);
        System.out.println("Number Of Books In Library: " + library1.numberOfBooks);
        System.out.println("Location of the Library: " + library1.location);
        System.out.println("Library Membership Fees: " + library1.membershipFee);

        Library library2 = new Library();
        library2.libraryName = "Oxford Library";
        library2.numberOfBooks = 500;
        library2.location = "Mysore";
        library2.membershipFee = 2750.50;

        System.out.println("Library Name: " + library2.libraryName);
        System.out.println("Number Of Books In Library: " + library2.numberOfBooks);
        System.out.println("Location of the Library: " + library2.location);
        System.out.println("Library Membership Fees: " + library2.membershipFee);

        Library library3 = new Library("State Library", 850, "Mumbai", 120.0);
        Library library4 = new Library("Public Library", 150, "Kolkata", 750.0);
        Library library5 = new Library("City Central Library", 1000, "Mysore", 700.0);
        Library library6 = new Library("Community Library", 430, "USA", 2050.0);

        library3.LibraryDetails();
        library4.LibraryDetails();
        library5.LibraryDetails();
        library6.LibraryDetails();

    }

}