public class Library {
    String libraryName;
    int numberOfBooks;
    String location;
    double membershipFee;

    public Library() {
        
    }

    public Library(String libraryName, int numberOfBooks, String location, double membershipFee) {
        this.libraryName = libraryName;
        this.numberOfBooks = numberOfBooks;
        this.location = location;
        this.membershipFee = membershipFee;

    }

    public void LibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Number of Books: " + numberOfBooks);
        System.out.println("Location: " + location);
        System.out.println("Membership Fee: " + membershipFee);

    }
}