package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Staff;

public class StaffDAO extends GenericDAO<Staff> {
    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
