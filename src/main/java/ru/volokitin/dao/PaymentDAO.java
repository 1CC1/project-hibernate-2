package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Payment;

public class PaymentDAO extends GenericDAO<Payment> {
    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
