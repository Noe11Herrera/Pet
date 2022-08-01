/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gruposw.beans;

import com.gruposw.TblPublicar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Soporte
 */
@Stateless
public class TblPublicarFacade extends AbstractFacade<TblPublicar> {

    @PersistenceContext(unitName = "PetFinderPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblPublicarFacade() {
        super(TblPublicar.class);
    }
    
}
