package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getWebsite() {
        Author author = new Author("sakamoto ryouma", "119", "google.com");
        Assertions.assertEquals("google.com", author.getWebsite());
    }

    @Test
    void getContactDetails() {
        Author author = new Author("sakamoto ryouma", "119", "google.com");
        Assertions.assertEquals("119", author.getContactDetails());

    }

    @Test
    void getName() {
        Author author = new Author("sakamoto ryouma", "119", "google.com");
        Assertions.assertEquals("sakamoto ryouma", author.getName());
    }
}