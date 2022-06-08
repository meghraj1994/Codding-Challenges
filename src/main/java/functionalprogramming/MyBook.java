package functionalprogramming;

public class MyBook {
    public String bookName;

    public MyBook(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "Book='" + bookName + '\'';

    }
}
