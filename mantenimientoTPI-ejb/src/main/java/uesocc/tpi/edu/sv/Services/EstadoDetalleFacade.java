/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;

/**
 *
 * @author yisus
 */
@Stateless
public class EstadoDetalleFacade extends AbstractFacade<EstadoDetalle> implements EstadoDetalleFacadeLocal {

    @PersistenceContext(unitName = "uesocc.tpi.edu.sv_mantenimientoTPI-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoDetalleFacade() {
        super(EstadoDetalle.class);
    }
    
}