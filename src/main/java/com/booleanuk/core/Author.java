package com.booleanuk.core;

public class Author {

    private String name;
    private String contactDetails;
    private String website;

    public Author(String name, String contactDetails, String website) {
        this.website = website;
        this.contactDetails = contactDetails;
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public String getName() {
        return name;
    }
}
