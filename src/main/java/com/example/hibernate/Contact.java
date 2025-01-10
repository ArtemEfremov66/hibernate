package com.example.hibernate;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Contact implements Serializable {
    private String name;
    private String surname;
    private int age;

    public Contact(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact contact)) return false;
        return getAge() == contact.getAge() && Objects.equals(getName(), contact.getName()) && Objects.equals(getSurname(), contact.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge());
    }
}
