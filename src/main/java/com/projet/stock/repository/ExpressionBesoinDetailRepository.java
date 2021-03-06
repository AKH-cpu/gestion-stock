/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.stock.repository;

import com.projet.stock.bean.ExpressionBesoinDetail;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anoir
 */
@Repository
public interface ExpressionBesoinDetailRepository extends JpaRepository<ExpressionBesoinDetail, Long> {

    List<ExpressionBesoinDetail> findByQte(Double qte);

    List<ExpressionBesoinDetail> findByQteLivre(Double qteLivre);


    int deleteByReference(String reference);
    
    int deleteByExpressionBesoinReference (String reference);

    ExpressionBesoinDetail findByReference(String reference);

//    int deleteByReference(String Reference);
//
//    ExpressionBesoinDetail findByReference(String Reference);


}
