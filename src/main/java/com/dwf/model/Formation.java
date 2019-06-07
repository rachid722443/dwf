package com.dwf.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "formation")
public class Formation {

    @Id
    @GeneratedValue
    private Integer idFormation;

    private String nomFormation;

    private Date dateFormation;

    @ManyToOne
    @JoinColumn(name = "idSociete", nullable = true)
    private Societe societe;

    @ManyToOne
    @JoinColumn(name = "idProduit", nullable = true)
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "idFormateur", nullable = true)
    private Formateur formateur;

    public Formation() {
    }

    public Formation(Integer idFormation, String nomFormation, Date dateFormation) {
	this.idFormation = idFormation;
	this.nomFormation = nomFormation;
	this.dateFormation = dateFormation;
    }

    public Integer getIdFormation() {
	return idFormation;
    }

    public void setIdFormation(Integer idFormation) {
	this.idFormation = idFormation;
    }

    public String getNomFormation() {
	return nomFormation;
    }

    public void setNomFormation(String nomFormation) {
	this.nomFormation = nomFormation;
    }

    public Date getDateFormation() {
	return dateFormation;
    }

    public void setDateFormation(Date dateFormation) {
	this.dateFormation = dateFormation;
    }

    public Societe getSociete() {
	return societe;
    }

    public void setSociete(Societe societe) {
	this.societe = societe;
    }

    public Produit getProduit() {
	return produit;
    }

    public void setProduit(Produit produit) {
	this.produit = produit;
    }

    public Formateur getFormateur() {
	return formateur;
    }

    public void setFormateur(Formateur formateur) {
	this.formateur = formateur;
    }

    @Override
    public String toString() {
	return "ID Formation : " + idFormation + "\n\tnomFormation : " + nomFormation + "\n\tdateFormation : "
		+ dateFormation + "\n";
    }
}