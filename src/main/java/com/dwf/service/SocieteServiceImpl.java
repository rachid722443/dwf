package com.dwf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dwf.dao.SocieteDAO;
import com.dwf.model.Societe;

@Service
@Transactional
public class SocieteServiceImpl implements SocieteService {
	
	@Autowired
	private SocieteDAO societeDAO;

	public void addSociete(Societe societe) {
		societeDAO.addSociete(societe);		
	}

	public void updateSociete(Societe societe) {
		societeDAO.updateSociete(societe);
	}

	public Societe getSociete(Integer id) {
		return societeDAO.getSociete(id);
	}

	public void deleteSociete(Integer id) {
		societeDAO.deleteSociete(id);
	}

	public List<Societe> getSocietes() {
		return societeDAO.getSocietes();
	}

}
