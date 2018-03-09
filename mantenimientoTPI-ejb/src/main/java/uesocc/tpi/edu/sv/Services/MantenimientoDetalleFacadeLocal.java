/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.MantenimientoDetalle;

/**
 *
 * @author yisus
 */
@Local
public interface MantenimientoDetalleFacadeLocal {

    void create(MantenimientoDetalle mantenimientoDetalle);

    void edit(MantenimientoDetalle mantenimientoDetalle);

    void remove(MantenimientoDetalle mantenimientoDetalle);

    MantenimientoDetalle find(Object id);

    List<MantenimientoDetalle> findAll();

    List<MantenimientoDetalle> findRange(int[] range);

    int count();
    
}
