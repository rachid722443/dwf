package com.dwf.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="commande")
public class Commande {

	@Id
	@GeneratedValue
	private Integer idCommande;

	private String libelle;
	
	private Date dateCommande;

    @ManyToOne
    @JoinColumn(name = "idSociete", nullable = true)
	private Societe societe;
	
    @ManyToOne
    @JoinColumn(name = "idFacture", nullable = true)
	private Facture facture;

	public Commande() {
	}

	public Commande(String libelle) {
		this.libelle = libelle;
		this.dateCommande = new Date();
	}

	public Integer getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Integer idCommande) {
		this.idCommande = idCommande;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	@Override
	public String toString() {
		return "ID Commande : " + idCommande + "\n\tlibelle : " + libelle + "\n\tdateCommande : " + dateCommande
				+ "\n\tidsociete : " + "\n\tidFacture :  \n";
	}
}