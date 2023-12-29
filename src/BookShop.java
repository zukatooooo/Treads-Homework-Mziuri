public class BookShop {
    private int availableBooks = 7500;

    public synchronized void buyBook(String customerName, int booksToBuy) {
        if (booksToBuy <= availableBooks) {
            System.out.println(customerName + " bought " + booksToBuy + " books.");
            availableBooks -= booksToBuy;
        } else {
            System.out.println("Not enough books available for " + customerName);
        }
    }
    public int getAvailableBooks() {
        return availableBooks;
    }
}