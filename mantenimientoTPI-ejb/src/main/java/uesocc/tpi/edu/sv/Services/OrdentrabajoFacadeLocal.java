/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

/**
 *
 * @author yisus
 */
@Local
public interface OrdentrabajoFacadeLocal {

    void create(Ordentrabajo ordentrabajo);

    void edit(Ordentrabajo ordentrabajo);

    void remove(Ordentrabajo ordentrabajo);

    Ordentrabajo find(Object id);

    List<Ordentrabajo> findAll();

    List<Ordentrabajo> findRange(int[] range);

    int count();
    
}
