public class Product {
    private final String name;
    private int price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
