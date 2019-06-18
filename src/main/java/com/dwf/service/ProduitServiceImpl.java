package com.dwf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dwf.dao.ProduitDAO;
import com.dwf.model.Produit;

@Service
@Transactional
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitDAO produitDAO;

    public void addProduit(Produit produit) {
	produitDAO.addProduit(produit);
    }

    public void updateProduit(Produit produit) {
	produitDAO.updateProduit(produit);
    }

    public Produit getProduit(Integer id) {
	return produitDAO.getProduit(id);
    }

    public void deleteProduit(Integer id) {
	produitDAO.deleteProduit(id);
    }

    public List<Produit> getProduits() {
	return produitDAO.getProduits();
    }

}
