package ru.maxvagan;

import java.util.Arrays;

public class Main {

    private static void addBookToLibruary(clsBook[] bookStore, clsBook inpBook) {
        boolean wasBookAdded = false;
        for (int i=0; i<bookStore.length; i++) {
            if (bookStore[i] == null) {
                bookStore[i] = inpBook;
                System.out.println("The book \"" + bookStore[i].getBookLabel() + "\" added to the cell "+i);
                wasBookAdded = true;
                break;
            }
        }
        if (!wasBookAdded)
            System.out.println("К сожалению вся библиотека занята и свободных ячеек в ней Нет!");
    }

    private static void showMyLibruary(clsBook[] bookStore) {
        System.out.println("В данный момент в нашей библиотеке есть:");
        String authorFullName = "";
        for (clsBook theBook:bookStore) {
            if (theBook == null) break;
            authorFullName = theBook.getAuthor().getFirstName() + " " + theBook.getAuthor().getSecondName();
            System.out.println(authorFullName+":"+theBook.getBookLabel()+":"+theBook.getPublicYear());
        }
    }

    private static int[] generateRandomArray(int arrayLenght, int beginValue, int endValue) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arrayLenght];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(endValue-beginValue) + beginValue;
        }
        return arr;
    }

    private static int getTotalSum(int[] inpBudgetBook) {
        int totalSum = 0;
        for (int cost : inpBudgetBook)
            totalSum+=cost;
        return totalSum;
    }

    private static double getAverageCostAmount(int inpLength, int inpTotalSum) {
        return inpTotalSum / (double) inpLength;
    }

    private static void calculateAverageOfMonthBudget(int[] inpBudgetBook) {
        double avgCostPerMonth = 0.00f;
        avgCostPerMonth = getAverageCostAmount(inpBudgetBook.length, getTotalSum(inpBudgetBook));
        System.out.println("BudgetBook:\r\n" + Arrays.toString(inpBudgetBook));
        System.out.println("Average cost amount per month is " + avgCostPerMonth + " rub");
    }

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
        System.out.println("====================== Middle Level ======================");
        clsBook[] myLibruary = new clsBook[5];
        addBookToLibruary(myLibruary, firstBook);
        addBookToLibruary(myLibruary, secondBook);
        showMyLibruary(myLibruary);
        System.out.println("====================== High Level ======================");
        System.out.println("Регистрация Общей Библиотеки!");
        clsLibruary ownLibruary = new clsLibruary(5);
        System.out.println("Добавление книг в Библиотеку!");
        ownLibruary.internalAddBookToLibruary(firstBook);
        ownLibruary.internalAddBookToLibruary(secondBook);
        System.out.println("Lets lookup the book \"The War of the Worlds\" by Herbert Wells, published at 1897");
        ownLibruary.showInfoAboutBookByLabel("The War of the Worlds");
        System.out.println("Lets lookup the book \"Undefeated\" by Stanislaw Lem, firstly published at 1964");
        ownLibruary.showInfoAboutBookByLabel("Undefeated");
        System.out.println("Lets change publication year of that book!");
        ownLibruary.changePublicYearOfBookByLabel("Undefeated", 2000);
        System.out.println("Methods - Extra Task 6");
        calculateAverageOfMonthBudget(generateRandomArray(30, 100_000, 200_000));
    }
}
