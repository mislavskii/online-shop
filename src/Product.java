public class Product {
    private final String name;
    private final int price;
    private int count;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.count = 1;
    }

    public Product(String name, int price, int count) {
        this(name, price);
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        return new Product(name, price);
    }

    public int getPrice() {
        return price;
    }

    public Product setPrice(int price) {
        return new Product(name, price);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", price=" + price + ", count=" + count + '}';
    }
}
