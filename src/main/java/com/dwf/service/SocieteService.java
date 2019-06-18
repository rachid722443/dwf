package com.dwf.service;

import java.util.List;

import com.dwf.model.Societe;

public interface SocieteService {

    public void addSociete(Societe societe);

    public void updateSociete(Societe societe);

    public Societe getSociete(Integer id);

    public void deleteSociete(Integer id);

    public List<Societe> getSocietes();

}
