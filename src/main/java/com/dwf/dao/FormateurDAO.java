package com.dwf.dao;

import java.util.List;

import com.dwf.model.Formateur;

public interface FormateurDAO {

    public void addFormateur(Formateur formateur);

    public void updateFormateur(Formateur formateur);

    public Formateur getFormateur(Integer id);

    public void deleteFormateur(Integer id);

    public List<Formateur> getFormateurs();

}
