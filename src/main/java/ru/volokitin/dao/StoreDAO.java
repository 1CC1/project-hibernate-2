package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Store;

public class StoreDAO extends GenericDAO<Store> {
    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class, sessionFactory);
    }
}
