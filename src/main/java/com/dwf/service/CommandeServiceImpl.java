package com.dwf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dwf.dao.CommandeDAO;
import com.dwf.dao.SocieteDAO;
import com.dwf.model.Commande;
import com.dwf.model.Societe;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {
	
	@Autowired
	private CommandeDAO commandeDAO;
	
	@Autowired
	private SocieteDAO societeDAO;

	public void addCommande(Commande commande) {
		Societe societe = societeDAO.getSociete(commande.getSociete().getNomSociete());
		commande.setSociete(societe);
		commandeDAO.addCommande(commande);		
	}

	public void updateCommande(Commande commande) {
		Societe societe = societeDAO.getSociete(commande.getSociete().getNomSociete());
		commande.setSociete(societe);
		commandeDAO.updateCommande(commande);
	}

	public Commande getCommande(Integer id) {
		return commandeDAO.getCommande(id);
	}

	public void deleteCommande(Integer id) {
		commandeDAO.deleteCommande(id);
	}

	public List<Commande> getCommandes() {
		return commandeDAO.getCommandes();
	}

}
