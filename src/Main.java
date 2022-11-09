import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        Basket vasyaBasket = new Basket();
        vasyaBasket.add(new Product("Молоко", 80), 2);
        vasyaBasket.add(new Product("Хлеб", 40));

        Basket petyaBasket = new Basket(350);
        petyaBasket.add(new Product("Лопата", 280));
        petyaBasket.add(new Product("Бочка", 2900));

        Basket mashaBasket = new Basket(new ArrayList<>(List.of(new Product[]{new Product("Стол", 5000)})), 50000);

        vasyaBasket.print("Корзина Васи:");
        petyaBasket.print("Корзина Пети:");
        mashaBasket.print("Корзина Маши:");
        System.out.println(mashaBasket.getTotalPrice());

    }

}