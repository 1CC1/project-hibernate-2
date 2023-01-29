package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Inventory;

public class InventoryDAO extends GenericDAO<Inventory> {
    public InventoryDAO(SessionFactory sessionFactory) {
        super(Inventory.class, sessionFactory);
    }
}