package com.dwf.dao;

import java.util.List;

import com.dwf.model.Categorie;

public interface CategorieDAO {

    public void addCategorie(Categorie team);

    public void updateCategorie(Categorie team);

    public Categorie getCategorie(Integer id);

    public void deleteCategorie(Integer id);

    public List<Categorie> getCategories();

}
