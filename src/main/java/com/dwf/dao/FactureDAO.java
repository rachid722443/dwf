package com.dwf.dao;

import java.util.List;

import com.dwf.model.Facture;

public interface FactureDAO {

    public void addFacture(Facture facture);

    public void updateFacture(Facture facture);

    public Facture getFacture(Integer id);

    public void deleteFacture(Integer id);

    public List<Facture> getFactures();

}
