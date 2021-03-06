/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.ws.rest;

import com.projet.stock.bean.Magasin;
import com.projet.stock.bean.Stock;
import com.projet.stock.service.facade.StockService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author KHALID
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("Stock/stock")
public class StockRest {
    @Autowired
    private StockService stockService;

    @GetMapping("/reference/{reference}")
    public Stock findByReference(@PathVariable String reference) {
        return stockService.findByReference(reference);
    }
    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return stockService.deleteByReference(reference);
    }
    
    @GetMapping("/")
    public List<Stock> findAll() {
        return stockService.findAll();
    }
    
    @PostMapping("/")
    public int save(@RequestBody Stock stock) {
        return stockService.save(stock);
    }

    @GetMapping("/reference/like/{reference}")
    public List<Stock> findByReferenceLike(@PathVariable String reference) {
        return stockService.findByReferenceLike(reference);
    }

    @PostMapping("/save")
    public int save(@RequestBody Magasin magasin) {
        return stockService.save(magasin,magasin.getStokes());
    }

    @GetMapping("/magasin/reference/{reference}")
    public List<Stock> findByMagasinReference(String reference) {
        return stockService.findByMagasinReference(reference);
    }
    
    @DeleteMapping("/magasin/reference/{reference}")
    public int deleteByMagasinReference(String reference) {
        return stockService.deleteByMagasinReference(reference);
    }
    
    
    
}
