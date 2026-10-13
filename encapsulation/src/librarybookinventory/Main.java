package librarybookinventory;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "Java Basics", "James", 3),
                new Book(102, "Python Basics", "Guido", 2),
                new Book(103, "HTML Basics", "Tim", 4)
        };
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book :"+books[i].getTitle());
            System.out.println("Available Books :"+books[i].getAvailableCopies());
        }
    }

}
