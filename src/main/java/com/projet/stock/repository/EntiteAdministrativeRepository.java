/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.repository;

import com.projet.stock.bean.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lenovo
 */
@Repository
public interface EntiteAdministrativeRepository extends JpaRepository<EntiteAdministrative, Long> {

    public EntiteAdministrative findByNom(String nom);

    public EntiteAdministrative findByReference(String reference);

//    public EntiteAdministrative findByPersonnelCode(String codeChef);
}
