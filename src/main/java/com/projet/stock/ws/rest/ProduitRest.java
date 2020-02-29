/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.ws.rest;

import com.projet.stock.bean.Produit;
import com.projet.stock.service.facade.ProduitService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author AKH
 */
@RestController
@RequestMapping("produit-api/produit")
public class ProduitRest {

    @Autowired
    ProduitService produitService;

    @GetMapping("/reference/{reference}")
    public Produit findByReference(@PathVariable String reference) {
        return produitService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return produitService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Produit produit) {
        return produitService.save(produit);
    }

    @GetMapping("/")
    public List<Produit> findAll() {
        return produitService.findAll();
    }

    @GetMapping("/familleProduit/libelle/{libelle}")
    public List<Produit> findByLibelleFamille(@PathVariable String libelle) {
        return produitService.findByLibelleFamille(libelle);
    }
}