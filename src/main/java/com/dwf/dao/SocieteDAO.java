package com.dwf.dao;

import java.util.List;

import com.dwf.model.Societe;

public interface SocieteDAO {

    public void addSociete(Societe societe);

    public void updateSociete(Societe societe);

    public Societe getSociete(Integer id);

    public Societe getSociete(String name);

    public void deleteSociete(Integer id);

    public List<Societe> getSocietes();

}
