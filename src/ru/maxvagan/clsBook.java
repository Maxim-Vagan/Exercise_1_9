package ru.maxvagan;

public class clsBook {
    private String bookLabel;
    private int publicYear;
    private clsBookAuthor author;

    public clsBook(String inpLabel, int inpYear, clsBookAuthor inpAuthor) {
        this.bookLabel = inpLabel;
        this.publicYear = inpYear;
        this.author = inpAuthor;
    }

    public String getBookLabel() {
        return this.bookLabel;
    }

    public int getPublicYear() {
        return this.publicYear;
    }

    public clsBookAuthor getAuthor() {
        return this.author;
    }

    public void setBookLabel(String inpLabel) {
        this.bookLabel = inpLabel;
    }

    public void setPublicYear(int inpYear) {
        this.publicYear = inpYear;
    }

    public void setAuthor(clsBookAuthor inpAuthor) {
        this.author = inpAuthor;
    }
}
