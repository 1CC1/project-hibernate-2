package ru.volokitin.dao;

import org.hibernate.SessionFactory;
import ru.volokitin.domain.Actor;

public class ActorDAO extends GenericDAO<Actor>{
    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
