package ru.maxvagan;

public class clsBookAuthor {
    private String firstName;
    private String secondName;

    public clsBookAuthor(String inp1Name, String inp2Name) {
        this.firstName = inp1Name;
        this.secondName = inp2Name;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getSecondName() {
        return this.secondName;
    }

    public void setFirstName(String inpName) {
        this.firstName = inpName;
    }

    public void setSecondName(String inpSurName) {
        this.secondName = inpSurName;
    }
}
