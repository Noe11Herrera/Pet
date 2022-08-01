/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gruposw.beans;

import com.gruposw.TblUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Soporte
 */
@Stateless
public class TblUsuarioFacade extends AbstractFacade<TblUsuario> {

    @PersistenceContext(unitName = "PetFinderPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUsuarioFacade() {
        super(TblUsuario.class);
    }
    
}
