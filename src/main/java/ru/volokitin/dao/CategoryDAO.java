package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Category;

public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
