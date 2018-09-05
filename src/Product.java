public class Product {

    private String productCode;
    private String productName;
    private double price;

    public Product(String productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

}
