package com.dwf.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue
    private Integer idProduit;

    private String nomProduit;

    private String version;

    private Float prixProduit;

    @ManyToOne
    @JoinColumn(name = "idCategorie", nullable = true)
    private Categorie categorie;

    @OneToMany
    @JoinColumn(nullable = true)
    private Set<Formation> listeFormations;

    public Produit() {
    }

    public Produit(Integer idProduit, String nomProduit, String version, float prixProduit) {
	this.idProduit = idProduit;
	this.nomProduit = nomProduit;
	this.version = version;
	this.prixProduit = prixProduit;
    }

    public Integer getIdProduit() {
	return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
	this.idProduit = idProduit;
    }

    public String getNomProduit() {
	return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
    }

    public String getVersion() {
	return version;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public Float getPrixProduit() {
	return prixProduit;
    }

    public void setPrixProduit(Float prixProduit) {
	this.prixProduit = prixProduit;
    }

    public Categorie getCategorie() {
	return categorie;
    }

    public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
    }

    public Set<Formation> getListeFormations() {
	return listeFormations;
    }

    public void setListeFormations(Set<Formation> listeFormations) {
	this.listeFormations = listeFormations;
    }

    @Override
    public String toString() {
	return "ID Produit : " + idProduit + "\n\tnomProduit  : " + nomProduit + "\n\tversion     : " + version
		+ "\n\tPrixProduit : " + prixProduit + "\n\tidCategorie : " + "\n";
    }
}
