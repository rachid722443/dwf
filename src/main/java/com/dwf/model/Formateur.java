package com.dwf.model;

import java.util.Set;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="formateur")
public class Formateur {
    
	@Id
	@GeneratedValue
	private Integer idFormateur;
    
	private String nomFormateur;
    
    private String adresse;
    
    private String cp;
    
    private String ville;
    
    private String pays;
    
    private String email;
    
    private String telephone;

    @OneToMany
    @JoinColumn(name = "idFormation")
    private Set<Formation> listeFormations;
    
    public Formateur() {
    }

    public Formateur(Integer idFormateur, String nomFormateur, String adresse, String cp, String ville, String pays, String email, String telephone) {
        this.idFormateur = idFormateur;
        this.nomFormateur = nomFormateur;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.email = email;
        this.telephone = telephone;
    }

    public Integer getIdFormateur() {
        return idFormateur;
    }

    public void setIdFormateur(Integer idFormateur) {
        this.idFormateur = idFormateur;
    }

    public String getNomFormateur() {
        return nomFormateur;
    }

    public void setNomFormateur(String nomFormateur) {
        this.nomFormateur = nomFormateur;
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

    public Set<Formation> getListeFormations() {
        return listeFormations;
    }

    public void setListeFormations(Set<Formation> listeFormations) {
        this.listeFormations = listeFormations;
    }

    @Override
    public String toString() {
        return "ID Formateur=" + idFormateur
                + "\n\tnomFormateur=" + nomFormateur
                + "\n\tadresse=" + adresse
                + "\n\tcp=" + cp
                + "\n\tville=" + ville
                + "\n\tpays=" + pays
                + "\n\temail=" + email
                + "\n\ttelephone=" + telephone+"\n";
    }
}
