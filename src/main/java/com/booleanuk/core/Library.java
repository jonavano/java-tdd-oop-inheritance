package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<LibraryItem> items;

    public void addToStock(LibraryItem item) {
        this.items.add(item);
    }

    public Library() {
        this.items = new ArrayList<>();
    }


    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInItem(String title) {
        List<LibraryItem> filtered = this.items.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutItem(String title) {
        List<LibraryItem> filtered = this.items.stream()
                .filter(article -> article.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }




}
