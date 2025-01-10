package com.example.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Persons {
    @EmbeddedId
    private Contact contact;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;

    public Persons(Contact contact, String phoneNumber, String cityOfLiving) {
        this.contact = contact;
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }

    public Persons() {
    }
}

