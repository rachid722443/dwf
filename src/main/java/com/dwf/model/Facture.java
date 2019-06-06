package com.dwf.model;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="facture")
public class Facture {
    
	@Id
	@GeneratedValue
	private Integer idFacture;
    
    private String nomFacture;
    
    private Date dateFacture;
    
    private Float montant;

    @OneToMany
    @JoinColumn(nullable = true)
    private Set<Commande> listeCommandes;
    
    public Facture() {
    }

    public Facture(Integer idFacture, String nomFacture, Date dateFacture, Float montant) {
        this.idFacture = idFacture;
        this.nomFacture = nomFacture;
        this.dateFacture = dateFacture;
        this.montant = montant;
    }

    public Integer getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Integer idFacture) {
        this.idFacture = idFacture;
    }

    public String getNomFacture() {
        return nomFacture;
    }

    public void setNomFacture(String nomFacture) {
        this.nomFacture = nomFacture;
    }

    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }

    public Float getMontant() {
        return montant;
    }

    public void setMontant(Float montant) {
        this.montant = montant;
    }

    public Set<Commande> getListeCommandes() {
        return listeCommandes;
    }

    public void setListeCommandes(Set<Commande> listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    @Override
    public String toString() {
        return "ID Facture : " + idFacture 
                + "\n\tnomFacture : " + nomFacture 
                + "\n\tdateFacture : " + dateFacture
                + "\n\tmontant : " + montant+"\n";
    }
}
