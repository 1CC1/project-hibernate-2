package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Country;

public class CountryDAO extends GenericDAO<Country> {
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}