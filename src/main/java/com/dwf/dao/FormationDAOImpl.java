package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Formation;

@Repository
public class FormationDAOImpl implements FormationDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    public void addFormation(Formation formation) {
	getCurrentSession().save(formation);
    }

    public void updateFormation(Formation formation) {
	getCurrentSession().update(null); //TODO 
    }

    public Formation getFormation(Integer id) {
	Formation formation = (Formation) getCurrentSession().get(Formation.class, id);
	return formation;
    }

    public void deleteFormation(Integer id) {
	Formation formation = getFormation(id);
	if (formation != null)
	    getCurrentSession().delete(formation);
    }

    @SuppressWarnings("unchecked")
    public List<Formation> getFormations() {
	return getCurrentSession().createQuery("from Formation").list();
    }

}
