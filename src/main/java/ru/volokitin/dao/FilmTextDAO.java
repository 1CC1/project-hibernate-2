package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.FilmText;

public class FilmTextDAO extends GenericDAO<FilmText> {
    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class, sessionFactory);
    }
}