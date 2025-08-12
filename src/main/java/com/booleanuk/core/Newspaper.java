package com.booleanuk.core;

public class Newspaper extends LibraryItem{
    public Newspaper(String title, Author author) {
        super(title, author);
    }

    @Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }
    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
