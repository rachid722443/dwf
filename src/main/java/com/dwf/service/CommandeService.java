package com.dwf.service;

import java.util.List;

import com.dwf.model.Commande;

public interface CommandeService {

    public void addCommande(Commande Commande);

    public void updateCommande(Commande Commande);

    public Commande getCommande(Integer id);

    public void deleteCommande(Integer id);

    public List<Commande> getCommandes();

}
