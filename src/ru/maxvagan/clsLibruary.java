package ru.maxvagan;

public class clsLibruary {
    private clsBook[] listOfBooks;

    public clsLibruary(int amountOfBooks) {
        this.listOfBooks = new clsBook[amountOfBooks];
    }

    public void internalAddBookToLibruary(clsBook inpBook) {
        boolean wasBookAdded = false;
        for (int i = 0; i < this.listOfBooks.length; i++) {
            if (this.listOfBooks[i] == null) {
                this.listOfBooks[i] = inpBook;
                System.out.println("The book \"" + this.listOfBooks[i].getBookLabel() + "\" added to the cell " + i);
                wasBookAdded = true;
                break;
            }
        }
        if (!wasBookAdded) System.err.println("К сожалению вся библиотека занята и свободных ячеек в ней Нет!");
    }

    public void internalShowMyLibruary() {
        System.out.println("В данный момент в нашей библиотеке есть:");
        String authorFullName = "";
        for (clsBook theBook : this.listOfBooks) {
            if (theBook == null) break;
            authorFullName = theBook.getAuthor().getFirstName() + " " + theBook.getAuthor().getSecondName();
            System.out.println(authorFullName + ":" + theBook.getBookLabel() + ":" + theBook.getPublicYear());
        }
    }

    public void showInfoAboutBookByLabel(String inpLabel) {
        boolean wasBookFound = false;
        for (clsBook theBook : this.listOfBooks) {
            if (theBook == null) break;
            if (theBook.getBookLabel().equals(inpLabel)) {
                System.out.printf("%1$s by %2$s %3$s was published in %4$s\r\n",
                        theBook.getBookLabel(),
                        theBook.getAuthor().getFirstName(),
                        theBook.getAuthor().getSecondName(),
                        theBook.getPublicYear()
                );
                wasBookFound = true;
                break;
            }
        }
        if (!wasBookFound)
            System.out.println("WARNING!: Asked book wasn't found in our Libruary!");
            //System.err.println("Asked book wasn't found in our Libruary!");
    }

    public void changePublicYearOfBookByLabel(String inpLabel, int inpYear) {
        boolean wasBookFound = false;
        for (clsBook theBook : this.listOfBooks) {
            if (theBook == null) break;
            if (theBook.getBookLabel().equals(inpLabel)) {
                theBook.setPublicYear(inpYear);
                System.out.printf("%1$s by %2$s %3$s was next time published in %4$s\r\n",
                        theBook.getBookLabel(),
                        theBook.getAuthor().getFirstName(),
                        theBook.getAuthor().getSecondName(),
                        theBook.getPublicYear()
                );
                wasBookFound = true;
                break;
            }
        }
        if (!wasBookFound)
            System.out.println("Asked book wasn't found in our Libruary!");
            //System.err.println("Asked book wasn't found in our Libruary!");
    }
}