import java.util.*;

class Book {
    private String name;
    private double price;
    private String authorName;
    private String isbnNo;
    private String publication;

    public Book(String name, double price, String authorName, String isbnNo, String publication) {
        this.name = name;
        this.price = price;
        this.authorName = authorName;
        this.isbnNo = isbnNo;
        this.publication = publication;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public String getPublication() {
        return publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authorName='" + authorName + '\'' +
                ", isbnNo='" + isbnNo + '\'' +
                ", publication='" + publication + '\'' +
                '}';
    }
}

public class BookMapOperations {
    public static void main(String[] args) {
        Map<Integer, Book> bookMap = new HashMap<>();
        bookMap.put(1, new Book("Book1", 100.0, "Author1", "ISBN1", "Publication1"));
        bookMap.put(2, new Book("Book2", 150.0, "Author2", "ISBN2", "Publication2"));
        bookMap.put(3, new Book("Book3", 200.0, "Author3", "ISBN3", "Publication1"));
        bookMap.put(4, new Book("Book4", 250.0, "Author4", "ISBN4", "Publication3"));
        bookMap.put(5, new Book("Book5", 300.0, "Author5", "ISBN5", "Publication2"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Display all books");
            System.out.println("2. Display a particular book by ID");
            System.out.println("3. Reduce price by 10% for a particular publication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Displaying all books:");
                    for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
                        System.out.println("Book ID: " + entry.getKey() + ", " + entry.getValue());
                    }
                    break;

                case 2:
                    System.out.print("Enter the book ID to display: ");
                    int bookId = scanner.nextInt();
                    if (bookMap.containsKey(bookId)) {
                        System.out.println("Book ID: " + bookId + ", " + bookMap.get(bookId));
                    } else {
                        System.out.println("Book ID not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the publication to reduce price by 10%: ");
                    String publication = scanner.next();
                    for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
                        Book book = entry.getValue();
                        if (book.getPublication().equalsIgnoreCase(publication)) {
                            double newPrice = book.getPrice() * 0.90;
                            book.setPrice(newPrice);
                        }
                    }
                    System.out.println("Prices updated. Displaying all books:");
                    for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
                        System.out.println("Book ID: " + entry.getKey() + ", " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
