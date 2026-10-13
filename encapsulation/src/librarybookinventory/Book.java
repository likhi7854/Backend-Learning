package librarybookinventory;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private  int availableCopies;

    public Book(int bookId, String title, String author, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        if(availableCopies>=0) {
            this.availableCopies = availableCopies;
            System.out.println("Copies are available");
        }
        else{
            System.out.println("Book not available");
        }

    }

    public void borrowBook(){
        if(this.availableCopies>0) {
            System.out.println("Copies are available");
            System.out.println("Borrow Successful!!");
            System.out.println("Total available books"+this.availableCopies--);
        }
        else{
            System.out.println("Book not available");
        }
    }


    public void returnBook(){
        System.out.println("Return Successful!!");
        System.out.println("Available Books: "+ this.availableCopies++);
    }


}
