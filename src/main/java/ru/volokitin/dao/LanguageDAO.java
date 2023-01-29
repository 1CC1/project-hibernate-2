package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Language;

public class LanguageDAO extends GenericDAO<Language> {
    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}