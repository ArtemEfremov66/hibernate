package com.example.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    EntityManager entityManager;

    public List<String> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("SELECT contact.name FROM Persons WHERE cityOfLiving = :city");
        query.setParameter("city", city);
        return (List<String>) query.getResultList();
    }
}
