package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Facture;

@Repository
public class FactureDAOImpl implements FactureDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    public void addFacture(Facture facture) {
	getCurrentSession().save(facture);
    }

    public void updateFacture(Facture facture) {
	getCurrentSession().update(null); //TODO

    }

    public Facture getFacture(Integer id) {
	Facture facture = (Facture) getCurrentSession().get(Facture.class, id);
	return facture;
    }

    public void deleteFacture(Integer id) {
	Facture facture = getFacture(id);
	if (facture != null)
	    getCurrentSession().delete(facture);
    }

    @SuppressWarnings("unchecked")
    public List<Facture> getFactures() {
	return getCurrentSession().createQuery("from Facture").list();
    }

}
