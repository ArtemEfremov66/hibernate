package com.example.hibernate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Persons {
    @EmbeddedId
    private Contact contact;
    private String phone_number;
    private String city_of_living;

    public Persons(Contact contact, String phone_number, String city_of_living) {
        this.contact = contact;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }

    public Persons() {
    }
}

