package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Customer;

public class CustomerDAO extends GenericDAO<Customer> {
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
