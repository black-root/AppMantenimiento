/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.TipoProcedimiento;

/**
 *
 * @author yisus
 */
@Local
public interface TipoProcedimientoFacadeLocal {

    void create(TipoProcedimiento tipoProcedimiento);

    void edit(TipoProcedimiento tipoProcedimiento);

    void remove(TipoProcedimiento tipoProcedimiento);

    TipoProcedimiento find(Object id);

    List<TipoProcedimiento> findAll();

    List<TipoProcedimiento> findRange(int[] range);

    int count();
    
}
