/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.repository;

import com.projet.stock.bean.LivraisonDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author AKH
 */
@Repository
public interface LivraisonDetailRepository extends JpaRepository<LivraisonDetail, Long> {

    LivraisonDetail findByReference(String reference);

    List<LivraisonDetail> findByLivraisonReference(String reference);

    int deleteByLivraisonReference(String reference);

}
