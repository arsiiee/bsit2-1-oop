public class TestBook {

    public static void main(String[] args) {
        System.out.println("═══ Book Record System ════");

        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        System.out.println("Adding books and ratings...");
        try {
            book1.addRating(4);
            book2.addMultipleRatings(5, 4, 3, 5);
            book3.addRating(3);
            book3.addMultipleRatings(2, 1, 5, 4); // Including an invalid rating here
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nBook Results:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("\nTotal books created: " + Book.getTotalBooks());

        Book highestRatedBook = getBestBook(book1, book2, book3);
        System.out.println("Highest rated book: " + highestRatedBook.getTitle() +
                " by " + highestRatedBook.getAuthor() +
                " (" + highestRatedBook.getAverageRating() + ")");
    }

    public static Book getBestBook(Book... books) {
        Book bestBook = books[0];
        for (Book book : books) {
            if (book.getAverageRating() > bestBook.getAverageRating()) {
                bestBook = book;
            }
        }
        return bestBook;
    }
}