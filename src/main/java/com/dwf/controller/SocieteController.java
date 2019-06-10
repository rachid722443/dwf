package com.dwf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dwf.model.Societe;
import com.dwf.service.SocieteService;

@Controller
@RequestMapping(value = "/societe")
public class SocieteController {

    @Autowired
    private SocieteService societeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addSocietePage() {
	ModelAndView modelAndView = new ModelAndView("add-societe-form");
	modelAndView.addObject("societe", new Societe());
	return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addingSociete(@ModelAttribute Societe societe) {

	ModelAndView modelAndView = new ModelAndView("home");
	societeService.addSociete(societe);
	String message = "Societe was successfully added.";
	modelAndView.addObject("message", message);

	return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfSocietes() {
	ModelAndView modelAndView = new ModelAndView("list-of-societes");

	List<Societe> societes = societeService.getSocietes();
	modelAndView.addObject("societes", societes);

	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editSocietePage(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("edit-societe-form");
	Societe societe = societeService.getSociete(id);
	modelAndView.addObject("societe", societe);
	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView edditingSociete(@ModelAttribute Societe societe, @PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("home");
	societe.setIdSociete(id);
	societeService.updateSociete(societe);
	String message = "Societe was successfully edited.";
	modelAndView.addObject("message", message);
	return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteSociete(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("home");
	societeService.deleteSociete(id);
	String message = "Societe was successfully deleted.";
	modelAndView.addObject("message", message);
	return modelAndView;
    }

}
