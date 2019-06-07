package com.dwf.dao;

import java.util.List;

import com.dwf.model.Societe;

public interface SocieteDAO {

    public void addSociete(Societe team);

    public void updateSociete(Societe team);

    public Societe getSociete(Integer id);

    public Societe getSociete(String name);

    public void deleteSociete(Integer id);

    public List<Societe> getSocietes();

}
