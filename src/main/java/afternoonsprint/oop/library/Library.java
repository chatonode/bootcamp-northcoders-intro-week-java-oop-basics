package afternoonsprint.oop.library;

import afternoonsprint.oop.books.Book;

import java.util.List;
import java.util.ArrayList;


public class Library {
    ArrayList<Book> books;

    public Library(List<Book> books) {
        this.books = new ArrayList<Book>(books);
    }

    public void depositBooks(Book bookToDeposit) {
        this.books.add(bookToDeposit);
    }

    public void withdrawBook(Book bookToWithdraw) {
        if (!(this.books.contains(bookToWithdraw))) {
            System.out.println("Whoops! There is no book named " + bookToWithdraw.title + " in our library.");
        }

        this.books.remove(bookToWithdraw);

    }


}
