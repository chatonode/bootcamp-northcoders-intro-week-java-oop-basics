package afternoonsprint.oop.books;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] newBookPages = {"page1", "page2", "page3", "page4"};
        int newBookPagesLength = newBookPages.length;
        Book newBook = new Book("The Three Musketeers", newBookPages);

        System.out.println("Title: " + newBook.title);
        System.out.println("Current Page: " + newBook.currentPageIndex);


        Random random = new Random();
        // Generates a random number between 1 and specified number
        int randomNumber = random.nextInt(newBookPagesLength) + 1;
        newBook.turnPage(randomNumber);

        System.out.println("Title: " + newBook.title);
        System.out.println("Current Page: " + newBook.currentPageIndex);

        /* */

    }
}
