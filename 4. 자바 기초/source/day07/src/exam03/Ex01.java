package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Order order = new Order();
        order.buy();
        order.sell();

        Buyer buyer = order;
        buyer.buy();

        Seller seller = order;
        seller.sell();

        order.order(); // buyer - order()
    }
}
