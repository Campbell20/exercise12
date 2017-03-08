package com.example;

/*
* Name: John Campbell
* Section: COSC/ITSE 
* Homework: Creating a bookshelf class that calls a book class
* Description: The main job of this class is to update multiple book objects and print them out
*/
public class BookShelf {

    public static void main(String [] strArgs){

        // prints out multiple book info from the user's input
        System.out.println("Book One: ");
        Book objBookOne = new Book();

        System.out.println("Book Two: ");
        Book objBookTwo = new Book();

        System.out.println("Book Three: ");
        Book objBookThree = new Book();


        System.out.print(objBookOne.toString());
        System.out.print(objBookTwo.toString());
        System.out.print(objBookThree.toString());
    }
}
