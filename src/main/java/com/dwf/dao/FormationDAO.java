package com.dwf.dao;

import java.util.List;

import com.dwf.model.Formation;

public interface FormationDAO {

    public void addFormation(Formation formation);

    public void updateFormation(Formation formation);

    public Formation getFormation(Integer id);

    public void deleteFormation(Integer id);

    public List<Formation> getFormations();

}
