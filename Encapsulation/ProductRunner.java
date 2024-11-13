
public class ProductRunner {
    public static void main(String[] args) {
        ProductDetails product1 = new ProductDetails(
                "Smartphone", 101, 699.99, 50, "Electronics", "TechBrand",
                "TechBrand Inc.", "2025-12-31", 0.5, true,
                "123456789012", "Shivam", 4.5, 24, "Black", "Plastic",
                "India", true);

        product1.displayProductDetails();

    }
}
