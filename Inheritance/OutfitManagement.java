
class Outfit {
    String brand;
    String size;
    String color;

    void displayOutfitInfo() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Color: " + color);
    }
}

class CasualOutfit extends Outfit {
    String style;
    String fabric;

    void displayCasualInfo() {
        System.out.println("Style: " + style + ", Fabric: " + fabric);
    }
}

class FormalOutfit extends Outfit {
    String occasion;
    String cut;

    void displayFormalInfo() {
        System.out.println("Occasion: " + occasion + ", Cut: " + cut);
    }
}

class SportsOutfit extends Outfit {
    String sport;
    String type;

    void displaySportsInfo() {
        System.out.println("Sport: " + sport + ", Type: " + type);
    }
}

public class OutfitManagement {
    public static void main(String[] args) {

        CasualOutfit casual = new CasualOutfit();
        FormalOutfit formal = new FormalOutfit();
        SportsOutfit sports = new SportsOutfit();

        casual.brand = "Manyavar";
        casual.size = "M";
        casual.color = "Indigo Blue";
        casual.style = "Kurta";
        casual.fabric = "Cotton";

        formal.brand = "adidas";
        formal.size = "L";
        formal.color = "Navy Blue";
        formal.occasion = "Office";
        formal.cut = "Slim Fit";

        sports.brand = "Nike";
        sports.size = "XL";
        sports.color = "Black";
        sports.sport = "Cricket";
        sports.type = "Jersey";

        System.out.println("Casual Outfit Info:");
        casual.displayOutfitInfo();
        casual.displayCasualInfo();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Formal Outfit Info:");
        formal.displayOutfitInfo();
        formal.displayFormalInfo();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Sports Outfit Info:");
        sports.displayOutfitInfo();
        sports.displaySportsInfo();
    }
}
