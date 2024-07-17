package afternoonsprint.oop.library;

import afternoonsprint.oop.books.*;

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

    public ArrayList<Book> getBooks() {
        return this.books;
    }

    public ArrayList<Ebook> getEbooks() {
        ArrayList<Ebook> eBookList = new ArrayList<>();
        for (Book book : this.books) {
            if (book instanceof Ebook) {
                eBookList.add((Ebook) book);
            }
        }

        return eBookList;
    }

    public ArrayList<GraphicNovel> getGraphicNovels() {
        ArrayList<GraphicNovel> graphicNovelList = new ArrayList<>();
        for (Book book : this.books) {
            if (book instanceof GraphicNovel) {
                graphicNovelList.add((GraphicNovel) book);
            }
        }

        return graphicNovelList;
    }

    public ArrayList<SheetMusic> getSheetMusic() {
        ArrayList<SheetMusic> musicSheetList = new ArrayList<>();
        for (Book book : this.books) {
            if (book instanceof SheetMusic) {
                musicSheetList.add((SheetMusic) book);
            }
        }

        return musicSheetList;
    }

    public void transformIntoEBook(Book bookToTransform) {
        Ebook newEBook = (Ebook) bookToTransform;
        newEBook.setFileType(FileType.PDF);
    }

}
