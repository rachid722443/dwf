package com.dwf.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="categorie")
public class Categorie {

    @Id
    @GeneratedValue
    private Integer idCategorie;
    
    private String nomCategorie;

    @OneToMany
    @JoinColumn(nullable = true)
    private Set<Produit> listeProduits;
    
    public Categorie() {
    }
    
    public Categorie(Integer idCategorie, String nomCategorie) {
        this.idCategorie = idCategorie;
        this.nomCategorie = nomCategorie;
    }

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Set<Produit> getListeProduits() {
        return listeProduits;
    }

    public void setListeProduits(Set<Produit> listeProduits) {
        this.listeProduits = listeProduits;
    }

    @Override
    public String toString() {
        return "ID Categorie: "+idCategorie
                + "\n\tCatégorie : "+nomCategorie+"\n";
    }
}