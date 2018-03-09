/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Tipomantenimiento;

/**
 *
 * @author yisus
 */
@Local
public interface TipomantenimientoFacadeLocal {

    void create(Tipomantenimiento tipomantenimiento);

    void edit(Tipomantenimiento tipomantenimiento);

    void remove(Tipomantenimiento tipomantenimiento);

    Tipomantenimiento find(Object id);

    List<Tipomantenimiento> findAll();

    List<Tipomantenimiento> findRange(int[] range);

    int count();
    
}
