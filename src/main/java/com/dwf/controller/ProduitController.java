package com.dwf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dwf.model.Produit;
import com.dwf.service.ProduitService;

@Controller
@RequestMapping(value = "/produit")
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addProduitPage() {
	ModelAndView modelAndView = new ModelAndView("add-produit-form");
	modelAndView.addObject("produit", new Produit());
	return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addingProduit(@ModelAttribute Produit produit) {

	ModelAndView modelAndView = new ModelAndView("home");
	produitService.addProduit(produit);
	String message = "Produit was successfully added.";
	modelAndView.addObject("message", message);

	return modelAndView;
    }

    @RequestMapping(value = "/list")
    public ModelAndView listOfProduits() {
	ModelAndView modelAndView = new ModelAndView("list-of-produits");

	List<Produit> produits = produitService.getProduits();
	modelAndView.addObject("produits", produits);

	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editProduitPage(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("edit-produit-form");
	Produit produit = produitService.getProduit(id);
	modelAndView.addObject("produit", produit);
	return modelAndView;
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public ModelAndView edditingProduit(@ModelAttribute Produit produit, @PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("home");
	produit.setIdProduit(id);
	produitService.updateProduit(produit);
	String message = "Produit was successfully edited.";
	modelAndView.addObject("message", message);
	return modelAndView;
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteProduit(@PathVariable Integer id) {
	ModelAndView modelAndView = new ModelAndView("home");
	produitService.deleteProduit(id);
	String message = "Produit was successfully deleted.";
	modelAndView.addObject("message", message);
	return modelAndView;
    }

}
