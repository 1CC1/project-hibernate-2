package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Rental;

public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }
}
