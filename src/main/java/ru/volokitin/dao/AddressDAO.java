package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Address;

public class AddressDAO extends GenericDAO<Address> {
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}