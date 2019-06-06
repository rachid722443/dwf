package com.dwf.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="societe")
public class Societe {

	@Id
	@GeneratedValue
	private Integer idSociete;
    
    private String nomSociete;
    
    private String secteurActivite;
    
    private String adresse;
    
    private String cp;
    
    private String ville;
    
    private String pays;
    
    private String nomClient;
    
    private String fonctionClient;
    
    private String email;
    
    private String telephone;

    @OneToMany
    @JoinColumn(nullable = true)
    private Set<Commande> listeCommandes;
    

    @OneToMany
    @JoinColumn(nullable = true)
    private Set<Formation> listeFormations;
    
    public Societe() {
    }

    public Societe(Integer idSociete, String nomSociete, String secteurActivite, String adresse, String cp, String ville, String pays, String nomClient, String fonctionClient, String email, String telephone) {
        this.idSociete = idSociete;
        this.nomSociete = nomSociete;
        this.secteurActivite = secteurActivite;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.nomClient = nomClient;
        this.fonctionClient = fonctionClient;
        this.email = email;
        this.telephone = telephone;
    }

    public Integer getIdSociete() {
        return idSociete;
    }

    public void setIdSociete(Integer idSociete) {
        this.idSociete = idSociete;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getFonctionClient() {
        return fonctionClient;
    }

    public void setFonctionClient(String fonctionClient) {
        this.fonctionClient = fonctionClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Commande> getListeCommandes() {
        return listeCommandes;
    }

    public void setListeCommandes(Set<Commande> listeCommandes) {
        this.listeCommandes = listeCommandes;
    }

    public Set<Formation> getListeFormations() {
        return listeFormations;
    }

    public void setListeFormations(Set<Formation> listeFormations) {
        this.listeFormations = listeFormations;
    }

    @Override
    public String toString() {
        return "ID Client : " + idSociete
            + "\n\tnomSociete : " + nomSociete
            + "\n\tsecteurActivite : " + secteurActivite
            + "\n\tadresse : " + adresse
            + "\n\tcp : " + cp
            + "\n\tville : " + ville
            + "\n\tpays : " + pays
            + "\n\tNomClient : " + nomClient
            + "\n\tfonctionClient : " + fonctionClient
            + "\n\temail : " + email
            + "\n\ttelephone : " + telephone +"\n";
    }   
}