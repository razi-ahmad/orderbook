// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Order order = new Order(
                "2023-08-20",
                35,
                22.5,
                "O123456-S",
                "T12345-S",
                "sell",
                "Reliance"
        );

        Order order2 = new Order(
                "2023-08-20",
                99,
                23.5,
                "O123456",
                "T12345",
                "buy",
                "Reliance"
        );

        OrderBook book = new OrderBook();
        book.processOrder(order);
        book.processOrder(order2);
    }
}