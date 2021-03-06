/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author AKH
 */
@Entity
public class Magasin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String nom;
    private double nbrMAxProduit;
    private double nbrProduit;
    private double nbrMaxEmploye;
    private double nbremploye;

    //liste dial les employes li khdmin fkola magasin
    @OneToMany
    private List<Personnel> employes;

//    @OneToMany
//    private List<Produit> produitsMagasin;
    
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToOne
    private EntiteAdministrative entiteAdministrative;
    
    @OneToMany(mappedBy = "magasin")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    List<Stock> stokes=new ArrayList<>();

//    @OneToMany(mappedBy = "magasin")
//    List<Stock> produitsMagasin;

    public List<Stock> getStokes() {
        return stokes;
    }

    public void setStokes(List<Stock> stokes) {
        this.stokes = stokes;
    }

    
    public List<Personnel> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Personnel> employes) {
        this.employes = employes;
    }

    public double getNbrProduit() {
        return nbrProduit;
    }

    public void setNbrProduit(double nbrProduit) {
        this.nbrProduit = nbrProduit;
    }

    public double getNbrMAxProduit() {
        return nbrMAxProduit;
    }

    public void setNbrMAxProduit(double nbrMAxProduit) {
        this.nbrMAxProduit = nbrMAxProduit;
    }

//    public List<Stock> getProduitsMagasin() {
//        return produitsMagasin;
//    }
//
//    public void setProduitsMagasin(List<Stock> produitsMagasin) {
//        this.produitsMagasin = produitsMagasin;
//    }

    public double getNbrMaxEmploye() {
        return nbrMaxEmploye;
    }

    public void setNbrMaxEmploye(double nbrMaxEmploye) {
        this.nbrMaxEmploye = nbrMaxEmploye;
    }

    public double getNbremploye() {
        return nbremploye;
    }

    public void setNbremploye(double nbremploye) {
        this.nbremploye = nbremploye;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

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
        if (!(object instanceof Magasin)) {
            return false;
        }
        Magasin other = (Magasin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projet.stock.bean.Magasin[ id=" + id + " ]";
    }
}
