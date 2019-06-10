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

    public void addSociete(Societe societe) {
	getCurrentSession().save(societe);
    }

    public void updateSociete(Societe societe) {
	Societe societeToUpdate = getSociete(societe.getIdSociete());
	societeToUpdate.setNomSociete(societe.getNomSociete());
	societeToUpdate.setSecteurActivite(societe.getSecteurActivite());
	societeToUpdate.setAdresse(societe.getAdresse());
	societeToUpdate.setCp(societe.getCp());
	societeToUpdate.setVille(societe.getVille());
	societeToUpdate.setPays(societe.getPays());
	societeToUpdate.setNomClient(societe.getNomClient());
	societeToUpdate.setFonctionClient(societe.getFonctionClient());
	getCurrentSession().update(societeToUpdate);

    }

    public Societe getSociete(Integer id) {
	Societe societe = (Societe) getCurrentSession().get(Societe.class, id);
	return societe;
    }

    public Societe getSociete(String name) {
	return (Societe) getCurrentSession().createQuery("from Societe where nomSociete like '" + name + "'").list()
		.get(0);
    }

    public void deleteSociete(Integer id) {
	Societe societe = getSociete(id);
	if (societe != null)
	    getCurrentSession().delete(societe);
    }

    @SuppressWarnings("unchecked")
    public List<Societe> getSocietes() {
	return getCurrentSession().createQuery("from Societe").list();
    }

}
