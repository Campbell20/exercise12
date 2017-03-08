package com.example;

import java.util.Scanner;

/*
* Name: John Campbell
* Section: COSC/ITSE 
* Homework: Creating a book class
* Description: In this class, I will create data form title, author, publisher, and copyrate date and it will intialize
* and accept the data. I will create a toString method that returnn a nicely formatted multi-line description of the
* book.
*/
public class Book {
    private String strTitle = "";
    private String strAuthor = "";
    private String strPublisher = "";
    private int intCopyrightDate;

    Scanner objInput = new Scanner(System.in);

    public Book(){
        inputTitle();
        inputAuthor();
        inputPublisher();
        inputCopyrightDate();
    }

    // getters and setters for title, author, publisher, and copyright date of a book
    public String getStrTitle() {
        return strTitle;
    }

    public void setStrTitle(String pstrTitle){
        strTitle =  pstrTitle;
    }

    public String getStrAuthor(){
        return strAuthor;
    }

    public void setStrAuthor(String pstrAuthor){
        strAuthor = pstrAuthor;
    }

    public String getStrPublisher(){
        return strPublisher;
    }

    public void setStrPublisher(String pstrPublisher){
        strPublisher = pstrPublisher;
    }

    public int getIntCopyrightDate(){
        return intCopyrightDate;
    }

    public void setIntCopyrightDate(int pintCopyrightDate){
        intCopyrightDate = pintCopyrightDate;
    }


    // the below functions are for input from the user to build the constructor of the Book class
    public void inputTitle(){
        System.out.println("Title: ");
        setStrTitle(objInput.next().toUpperCase());
    }

    public void inputAuthor(){
        System.out.print("Author: ");
        setStrAuthor(objInput.next().toUpperCase());
    }

    public void inputPublisher(){
        System.out.print("Publisher: ");
        setStrPublisher(objInput.next().toUpperCase());
    }

    public void inputCopyrightDate() {
        System.out.print("Copyright Date: ");
        setIntCopyrightDate(objInput.nextInt());
    }

    // prints out the information that the user typed in for each book
    public String toString(){
        return "\n" +
                "Data--------- | Book Info\n" +
                "         Title: " + this.getStrTitle() + "\n" +
                "        Author: " + this.getStrAuthor() + "\n" +
                "     Publisher: " + this.getStrPublisher() + "\n" +
                "Copyright Date: " + this.getIntCopyrightDate() + "\n";

    }

}

    /*
    public String getBookStats(){
        return "\n" +
                "Data--------- | Book Info\n" +
                "*********Title: " + this.getStrTitle() + "\n" +
                "********Author: " + this.getStrAuthor() + "\n" +
                "*****Publisher: " + this.getStrPublisher() + "\n" +
                "Copyright Date: " + this.getIntCopyrightDate() + "\n";

    }

    public void setBookStats(String pstrTitle, String pstrAuthor, String pstrPublisher, int pintCopyrightDate){
        this.setStrTitle(pstrTitle);
        this.setStrAuthor(pstrAuthor);
        this.setStrPublisher(pstrPublisher);
        this.setIntCopyrightDate(pintCopyrightDate);
    }
    */


