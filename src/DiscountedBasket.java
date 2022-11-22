public class DiscountedBasket extends Basket {

    public void addProduct(Product product, int count) {
        if (product.getPrice() > 50) {
            product = product.setPrice(product.getPrice() - 25);
        }
        super.addProduct(product, count);
    }
}
