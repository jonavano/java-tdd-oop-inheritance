package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void addToStock() {
        Library library = new Library();
        Assertions.assertEquals(0, library.items.size());
        library.addToStock(new Article("Junit5 updates"));
        Assertions.assertEquals(1, library.items.size());
    }

    @Test
    void checkInItem() {
        Library library = new Library();
        library.addToStock(new Article("Junit"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("not a book"));
        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Junit"));

    }

    @Test
    void checkOutItem() {
        Library library = new Library();
        library.addToStock(new Article("Junit"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("not a book"));
        Assertions.assertEquals("item has been checked out", library.checkOutItem("Junit"));
        Assertions.assertEquals("item has been checked in", library.checkInItem("Junit"));


    }
}