public class Product {
    private String name;
    private double price;
    private boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Product{name='" + name + '\'' + ", price=" + price + ", inStock=" + inStock + '}';
    }
}
