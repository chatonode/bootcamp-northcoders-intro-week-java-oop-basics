package afternoonsprint.oop.books;


enum FileType {
    XML,
    CSV,
    JSON
}

public class Ebook extends Book {
    FileType fileType;

    public Ebook(String title, String[] pages) {
        super(title, pages);
    }
}
