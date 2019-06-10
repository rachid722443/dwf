package com.dwf.dao;

import java.util.List;

import com.dwf.model.Produit;

public interface ProduitDAO {

    public void addProduit(Produit produit);

    public void updateProduit(Produit produit);

    public Produit getProduit(Integer id);

    public Produit getProduit(String name);

    public void deleteProduit(Integer id);

    public List<Produit> getProduits();

}
