package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Film;

public class FilmDAO extends GenericDAO<Film>{
    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
