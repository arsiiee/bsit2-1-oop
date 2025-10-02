public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 218, "Fiction") {
            @Override
            public void BorrowItem(String borrowerName) {

            }
        };
        Book book2 = new Book("B002", "1984", "George Orwell", "9780451524935", 328, "Dystopian") {
            @Override
            public void BorrowItem(String borrowerName) {

            }
        };
        Magazine mag1 = new Magazine("M001", "Time", "Time Inc.", 1, "January 2023", true) {
            @Override
            public void BorrowItem(String borrowerName) {

            }
        };
        Magazine mag2 = new Magazine("M002", "National Geographic", "Nat Geo", 2, "February 2023", false) {
            @Override
            public void BorrowItem(String borrowerName) {

            }
        };
        DVD dvd1 = new DVD("D001", "Inception", "Christopher Nolan", 148, "PG-13", "Sci-Fi");
        DVD dvd2 = new DVD("D002", "The Dark Knight", "Christopher Nolan", 152, "PG-13", "Action");

        Student student = new Student("S001", "John Doe", "john@example.com", "S123", "Computer Science");
        Faculty faculty = new Faculty("F001", "Dr. Smith", "smith@example.com", "Engineering", "Professor");

        LibraryManager manager = new LibraryManager();
        manager.addItem(book1);
        manager.addItem(book2);
        manager.addItem(mag1);
        manager.addItem(mag2);
        manager.addItem(dvd1);
        manager.addItem(dvd2);

        manager.borrowItem("B001", "John Doe");
        manager.displayAllItems();
        manager.returnItem("B001");
        manager.displayAllItems();

        double totalFees = manager.calculateTotalLateFees(3);
        System.out.println("Total Late Fees: $" + totalFees);
    }
}
interface Borrowable{
    String getItemType();

    double calculateLateFee(int daysLate);

    void BorrowItem(String borrowerName);

    void borrowItem(String borrowerName);

    void returnItem();
    boolean isAvailable();
    int getBorrowingPeriod();
    default String getBorrowingStatus() {
        return isAvailable() ? "Available for borrowing" : "Currently borrowed";
    }
}