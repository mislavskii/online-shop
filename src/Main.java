import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Basket vasyaBasket = new Basket();
        vasyaBasket.addProduct(new Product("Молоко", 80), 2);
        vasyaBasket.addProduct(new Product("Хлеб", 40));

        Basket petyaBasket = new Basket(350);
        petyaBasket.addProduct(new Product("Лопата", 280), 2);
        petyaBasket.addProduct(new Product("Бочка", 2900));

        Basket mashaBasket = new Basket(new ArrayList<>(List.of(new Product[]{new Product("Стол", 5000)})), 50000);

        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
        mashaBasket.print("Корзина Маши:");
        System.out.println(mashaBasket.getTotalPrice());

        System.out.println();
        System.out.println("Появилась DiscountedBasket");
        DiscountedBasket vovaBasket = new DiscountedBasket();

        Product milk = new Product("молоко", 56);
        System.out.println(milk);

        vovaBasket.addProduct(milk);
        vovaBasket.print("Корзина Вовы:");
        System.out.println(milk);

        System.out.println("Total baskets: " + Basket.count);

        Session session = new Session();

        System.out.println("Total baskets: " + Basket.count);

        System.out.println();

        ContactDetails details = new ContactDetails("Thailand", "Bangkok", "Onnut35", 339, 301, "0873440160");
        Customer jet = new Customer("Somying Khonboon", details);

        System.out.println(jet);

    }

}