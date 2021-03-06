/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.ws.rest;

import com.projet.stock.bean.ExpressionBesoin;
import com.projet.stock.service.facade.ExpressionBesoinService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anoir
 */
@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("stock-api/ExpressionBesoin")
public class ExpressionBesoinRest {

    @Autowired
    private ExpressionBesoinService expressionBesoinService;

    @GetMapping("/reference/{reference}")
    public ExpressionBesoin findByReference(@PathVariable String reference) {
        return expressionBesoinService.findByReference(reference);
    }

    @GetMapping("/dateExpressionBesoin/{dateExpressionBesoin}")
    public ExpressionBesoin findBydateExpressionBesoin(@PathVariable Date dateExpressionBesoin) {
        return expressionBesoinService.findBydateExpressionBesoin(dateExpressionBesoin);
    }

    @PostMapping("/")
    public int save(@RequestBody ExpressionBesoin expressionBesoin) {
        return expressionBesoinService.save(expressionBesoin);
    }


    @PutMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return expressionBesoinService.deleteByReference(reference);
//    @PutMapping("/Reference/{Reference}")
//    public int deleteByReference(@PathVariable String Reference) {
//        return expressionBesoinService.deleteByReference(Reference);
//>>>>>>> 665f66e updates services
    }

    @GetMapping("/")
    public List<ExpressionBesoin> findAll() {
        return expressionBesoinService.findAll();
    }

    @GetMapping("/codeEmp/{codeEmp}")
    public List<ExpressionBesoin> findByChef(@PathVariable String codeEmp) {
        return expressionBesoinService.findByChef(codeEmp);
    }

}
