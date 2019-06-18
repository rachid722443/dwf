package com.dwf.service;

import java.util.List;

import com.dwf.model.Produit;

public interface ProduitService {

    public void addProduit(Produit produit);

    public void updateProduit(Produit produit);

    public Produit getProduit(Integer id);

    public void deleteProduit(Integer id);

    public List<Produit> getProduits();

}
