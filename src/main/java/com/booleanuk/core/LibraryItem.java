package com.booleanuk.core;

public class LibraryItem {

    String title;
    private Author author;

    boolean onLoan = false;

    public LibraryItem(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public String checkIn() {
        if (!this.isOnLoan()) {
            return "item is not currently on loan";
        }

        this.onLoan = false;

        return "item has been checked in";
    }

    public String checkOut() {
        if (this.isOnLoan()) {
            return "item is currently on loan";
        }

        this.onLoan = true;

        return "item has been checked out";
    }
}
