package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Commande;

@Repository
public class CommandeDAOImpl implements CommandeDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addCommande(Commande commande) {
		getCurrentSession().save(commande);
	}

	public void updateCommande(Commande Commande) {
		Commande CommandeToUpdate = getCommande(Commande.getIdCommande());
		getCurrentSession().update(CommandeToUpdate);
		
	}

	public Commande getCommande(Integer id) {
		Commande Commande = (Commande) getCurrentSession().get(Commande.class, id);
		return Commande;
	}

	public void deleteCommande(Integer id) {
		Commande Commande = getCommande(id);
		if (Commande != null)
			getCurrentSession().delete(Commande);
	}

	@SuppressWarnings("unchecked")
	public List<Commande> getCommandes() {
		return getCurrentSession().createQuery("from Commande").list();
	}

}
