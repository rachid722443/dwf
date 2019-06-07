package com.dwf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dwf.model.Commande;
import com.dwf.service.CommandeService;

@Controller
@RequestMapping(value = "/commande")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addCommandePage() {
	ModelAndView modelAndView = new ModelAndView("add-commande-form");
	modelAndView.addObject("commande", new Commande());
	return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addingCommande(@ModelAttribute Commande commande) {

	ModelAndView modelAndView = new ModelAndView("home");
	commandeService.addCommande(commande);
	String message = "Commande was successfully added.";
	modelAndView.addObject("message", message);

	return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfCommandes() {
	ModelAndView modelAndView = new ModelAndView("list-of-commandes");

	List<Commande> commandes = commandeService.getCommandes();
	modelAndView.addObject("commandes", commandes);

	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editCommandePage(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("edit-commande-form");
	Commande commande = commandeService.getCommande(id);
	modelAndView.addObject("commande", commande);
	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView edditingCommande(@ModelAttribute Commande commande, @PathVariable Integer id) {

	ModelAndView modelAndView = new ModelAndView("home");

	commandeService.updateCommande(commande);

	String message = "Commande was successfully edited.";
	modelAndView.addObject("message", message);

	return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteCommande(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("home");
	commandeService.deleteCommande(id);
	String message = "Commande was successfully deleted.";
	modelAndView.addObject("message", message);
	return modelAndView;
    }

}
