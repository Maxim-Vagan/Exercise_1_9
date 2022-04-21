package ru.maxvagan;

public class Main {

    public static void main(String[] args) {
        clsBookAuthor firstAuthor = new clsBookAuthor("Agatha", "Christie");
        clsBook firstBook = new clsBook("Death On The Nile", 1937, firstAuthor);
        clsBookAuthor secondAuthor = new clsBookAuthor("Stanislaw", "Lem");
        clsBook secondBook = new clsBook("Undefeated", 1964, secondAuthor);
        System.out.println("====================== First Book ======================");
        System.out.println("Label: " + firstBook.getBookLabel());
        System.out.println("Author: " + firstBook.getAuthor().getFirstName() + " " + firstBook.getAuthor().getSecondName());
        System.out.println("Publication Year: " + firstBook.getPublicYear());
        System.out.println("====================== Second Book ======================");
        System.out.println("Label: " + secondBook.getBookLabel());
        System.out.println("Author: " + secondBook.getAuthor().getFirstName() + " " + secondBook.getAuthor().getSecondName());
        System.out.println("Publication Year: " + secondBook.getPublicYear());
        secondBook.setPublicYear(1990);
        System.out.println("newPublicYear = " + secondBook.getPublicYear());
    }
}
