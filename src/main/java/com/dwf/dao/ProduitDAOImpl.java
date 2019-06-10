package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Produit;

@Repository
public class ProduitDAOImpl implements ProduitDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    public void addProduit(Produit produit) {
	getCurrentSession().save(produit);
    }

    public void updateProduit(Produit produit) {
	Produit produitToUpdate = getProduit(produit.getIdProduit());//TODO
	getCurrentSession().update(produitToUpdate);

    }

    public Produit getProduit(Integer id) {
	Produit produit = (Produit) getCurrentSession().get(Produit.class, id);
	return produit;
    }

    public Produit getProduit(String name) {
	return (Produit) getCurrentSession().createQuery("from Produit where nomProduit like '" + name + "'").list()
		.get(0);
    }

    public void deleteProduit(Integer id) {
	Produit produit = getProduit(id);
	if (produit != null)
	    getCurrentSession().delete(produit);
    }

    @SuppressWarnings("unchecked")
    public List<Produit> getProduits() {
	return getCurrentSession().createQuery("from Produit").list();
    }

}
