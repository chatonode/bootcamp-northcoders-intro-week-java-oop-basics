package afternoonsprint.oop.books;

public class Book {
    public String title;
    private String[] pages;
    public int currentPageIndex;

    public Book(String title, String[] pages) {
        this.title = title;
        this.pages = pages;

        this.currentPageIndex = 1;
    }

    public void turnPage(int numOfPages) {
        if (this.pages.length - numOfPages > 0) {
            this.currentPageIndex += numOfPages;
        }
    }
}
