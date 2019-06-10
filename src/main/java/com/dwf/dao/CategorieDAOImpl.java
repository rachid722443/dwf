package com.dwf.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dwf.model.Categorie;

@Repository
public class CategorieDAOImpl implements CategorieDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
	return sessionFactory.getCurrentSession();
    }

    public void addCategorie(Categorie commande) {
	getCurrentSession().save(commande);
    }

    public void updateCategorie(Categorie Categorie) {
	Categorie CategorieToUpdate = getCategorie(Categorie.getIdCategorie());
	getCurrentSession().update(CategorieToUpdate);

    }

    public Categorie getCategorie(Integer id) {
	Categorie Categorie = (Categorie) getCurrentSession().get(Categorie.class, id);
	return Categorie;
    }

    public void deleteCategorie(Integer id) {
	Categorie Categorie = getCategorie(id);
	if (Categorie != null)
	    getCurrentSession().delete(Categorie);
    }

    @SuppressWarnings("unchecked")
    public List<Categorie> getCategories() {
	return getCurrentSession().createQuery("from Categorie").list();
    }

}
