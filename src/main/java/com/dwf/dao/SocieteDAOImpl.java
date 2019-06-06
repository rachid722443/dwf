package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Societe;

@Repository
public class SocieteDAOImpl implements SocieteDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addSociete(Societe Societe) {
		getCurrentSession().save(Societe);
	}

	public void updateSociete(Societe Societe) {
		Societe SocieteToUpdate = getSociete(Societe.getIdSociete());
		getCurrentSession().update(SocieteToUpdate);
		
	}

	public Societe getSociete(Integer id) {
		Societe Societe = (Societe) getCurrentSession().get(Societe.class, id);
		return Societe;
	}

	public Societe getSociete(String name) {
		return (Societe) getCurrentSession().createQuery("from Societe where nomSociete like '" + name +"'").list().get(0);
	}

	public void deleteSociete(Integer id) {
		Societe Societe = getSociete(id);
		if (Societe != null)
			getCurrentSession().delete(Societe);
	}

	@SuppressWarnings("unchecked")
	public List<Societe> getSocietes() {
		return getCurrentSession().createQuery("from Societe").list();
	}

}
