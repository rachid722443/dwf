package com.dwf.service;

import java.util.List;

import com.dwf.model.Societe;

public interface SocieteService {
	
	public void addSociete(Societe Societe);
	public void updateSociete(Societe Societe);
	public Societe getSociete(Integer id);
	public void deleteSociete(Integer id);
	public List<Societe> getSocietes();

}
