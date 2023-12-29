import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop();

        List<String> customers = Arrays.asList("Customer 1", "Customer 2");

        customers.parallelStream().forEach(customer ->
                bookShop.buyBook(customer, 5000)
        );

        System.out.println(bookShop.getAvailableBooks() + " books remaining in the shop.");
    }
}
