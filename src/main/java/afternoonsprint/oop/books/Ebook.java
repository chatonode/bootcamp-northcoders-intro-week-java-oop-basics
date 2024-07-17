package afternoonsprint.oop.books;


import java.util.ArrayList;

public class Ebook extends Book {

    private FileType fileType;

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public Ebook(String title, String[] pages) {
        super(title, pages);
    }

}
