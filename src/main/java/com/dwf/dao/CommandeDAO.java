package com.dwf.dao;

import java.util.List;

import com.dwf.model.Commande;
import com.dwf.model.Team;

public interface CommandeDAO {
	
	public void addCommande(Commande team);
	public void updateCommande(Commande team);
	public Commande getCommande(Integer id);
	public void deleteCommande(Integer id);
	public List<Commande> getCommandes();

}
