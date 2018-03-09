/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Unidad;

/**
 *
 * @author yisus
 */
@Local
public interface UnidadFacadeLocal {

    void create(Unidad unidad);

    void edit(Unidad unidad);

    void remove(Unidad unidad);

    Unidad find(Object id);

    List<Unidad> findAll();

    List<Unidad> findRange(int[] range);

    int count();
    
}
