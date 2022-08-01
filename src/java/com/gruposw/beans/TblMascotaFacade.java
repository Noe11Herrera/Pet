/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gruposw.beans;

import com.gruposw.TblMascota;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Soporte
 */
@Stateless
public class TblMascotaFacade extends AbstractFacade<TblMascota> {

    @PersistenceContext(unitName = "PetFinderPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblMascotaFacade() {
        super(TblMascota.class);
    }
    
}
