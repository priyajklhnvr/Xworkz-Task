
public class ProductDetails {

    private String productName;
    private int productId;
    private double price;
    private int quantity;
    private String category;

    private String brand;
    private String manufacturer;
    private String expiryDate;
    private double weight;

    private boolean inStock;
    private String barcode;
    private String supplier;
    private double rating;
    private int warrantyPeriod;

    private String color;
    private String material;
    private String countryOfOrigin;

    private boolean isReturnable;

    public ProductDetails(String productName, int productId, double price, int quantity, String category, String brand,
            String manufacturer, String expiryDate, double weight, boolean inStock,
            String barcode, String supplier, double rating, int warrantyPeriod, String color,
            String material, String countryOfOrigin, boolean isReturnable) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.weight = weight;

        this.inStock = inStock;
        this.barcode = barcode;
        this.supplier = supplier;
        this.rating = rating;
        this.warrantyPeriod = warrantyPeriod;
        this.color = color;
        this.material = material;
        this.countryOfOrigin = countryOfOrigin;

        this.isReturnable = isReturnable;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isReturnable() {
        return isReturnable;
    }

    public void setReturnable(boolean isReturnable) {
        this.isReturnable = isReturnable;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Rating: " + rating);
        System.out.println("Barcode: " + barcode);
    }

}
