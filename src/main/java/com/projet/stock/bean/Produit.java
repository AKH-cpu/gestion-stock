/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author AKH
 */
@Entity
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String libelle;

    @OneToMany(mappedBy = "produit")
    private List<ExpressionBesoinDetail> expressionBesoinDetails;

    public List<ExpressionBesoinDetail> getExpressionBesoinDetails() {
        return expressionBesoinDetails;
    }

    public void setExpressionBesoinDetails(List<ExpressionBesoinDetail> expressionBesoinDetails) {
        this.expressionBesoinDetails = expressionBesoinDetails;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public FamilleProduit getFamilleProduit() {
        return familleProduit;
    }

    public void setFamilleProduit(FamilleProduit familleProduit) {
        this.familleProduit = familleProduit;
    }

    @ManyToOne
    private FamilleProduit familleProduit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projet.stock.bean.Produit[ id=" + id + " ]";
    }

}