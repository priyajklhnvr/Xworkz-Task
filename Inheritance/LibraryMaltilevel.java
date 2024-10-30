
class Libraries {
    String libraryName;
    String location;

    void displayLibraryInfo() {
        System.out.println("Library Name: " + libraryName + ", Location: " + location);
    }
}

class Section extends Libraries {
    String sectionName;
    int numBookShel;
    String sectionHead;

    void displaySectionInfo() {
        System.out.println("Section Name: " + sectionName);
    }
}

class Book extends Section {
    String title;
    String author;
    String isbnForBook;

    void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbnForBook);
    }
}

public class LibraryMaltilevel {
    public static void main(String[] args) {

        Book library = new Book();

        library.libraryName = "National Library";
        library.location = "Bengaluru";
        library.sectionName = "Literature";
        library.numBookShel = 25;
        library.sectionHead = "Ramesh Sharma";
        library.title = "Wings of Fire";
        library.author = "Dr. A.P.J. Abdul Kalam";
        library.isbnForBook = "978-8173711466";

        library.displayLibraryInfo();
        library.displaySectionInfo();
        library.displayBookInfo();
    }
}
