package com.cejv416.inheritance02;

/**
 * Subclass of Product
 *
 * @author Ken Fogel
 */
public class Book extends Product {

    private String author;

    public Book() {
        author = "";
        // Static variable that increments every time an object is created that
        // is a subclass of Product
        count++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Author:      " + author + "\n";
    }
}
