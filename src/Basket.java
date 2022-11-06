import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> items = new ArrayList<>();
    private int totalPrice = 0;
    private int limit = 1000000;

    public Basket() {
        String description = "Список товаров:\n";
    }

    public Basket(int limit){
        this();
        this.limit = limit;
    }

    public Basket(ArrayList<Product> items, int limit) {  // re-initialization of earlier basket
        this();
        this.items = items;
        this.limit = limit;
        this.totalPrice = getTotalPrice();
    }
// ^^^Above are all constructors^^^

    public void add(Product product) {  // overloaded method
        add(product, 1);  // adding single piece of product
    }

    public void add (Product product, int count) {  // adding any number of pieces
        if (contains(product)) {
            System.out.println("Товар уже есть в корзине.");
            return;
        }
        if (totalPrice + product.getPrice() * count > limit) {
            System.out.printf("Превышен лимит, собака. Добавление товара \"%s\" нежелательно.%n%n", product.getName());
            return;
        }
        product.setCount(count);
        items.add(product);
        totalPrice = getTotalPrice();
    }

    public int getTotalPrice(){
        totalPrice = 0;
        for (Product item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    boolean contains(Product product){
        return !items.isEmpty() && items.contains(product);
    }

    public void clear() {
        items = new ArrayList<>();
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if(items.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println(items);
        }
    }

}
