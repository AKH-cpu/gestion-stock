/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    private Double prixUnitaireHT;
    private Double tauxTVA;
    private Double prixUnitaireTTC;
     //ana li zatha khalid
    private Double tva;
    @ManyToOne
    private FamilleProduit familleProduit;

    @OneToMany(mappedBy = "produit")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
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

    public Double getPrixUnitaireHT() {
        return prixUnitaireHT;
    }

    public void setPrixUnitaireHT(Double prixUnitaireHT) {
        this.prixUnitaireHT = prixUnitaireHT;
    }

    public Double getTauxTVA() {
        return tauxTVA;
    }

    public void setTauxTVA(Double tauxTVA) {
        this.tauxTVA = tauxTVA;
    }

    public Double getPrixUnitaireTTC() {
        return prixUnitaireTTC;
    }

    public void setPrixUnitaireTTC(Double prixUnitaireTTC) {
        this.prixUnitaireTTC = prixUnitaireTTC;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTva() {
        return tva;
    }

    public void setTva(Double tva) {
        this.tva = tva;
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
