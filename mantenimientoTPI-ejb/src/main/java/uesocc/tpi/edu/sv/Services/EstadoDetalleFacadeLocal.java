/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;

/**
 *
 * @author yisus
 */
@Local
public interface EstadoDetalleFacadeLocal {

    void create(EstadoDetalle estadoDetalle);

    void edit(EstadoDetalle estadoDetalle);

    void remove(EstadoDetalle estadoDetalle);

    EstadoDetalle find(Object id);

    List<EstadoDetalle> findAll();

    List<EstadoDetalle> findRange(int[] range);

    int count();
    
}
