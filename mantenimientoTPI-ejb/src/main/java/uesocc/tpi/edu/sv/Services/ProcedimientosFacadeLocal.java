/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Procedimientos;

/**
 *
 * @author yisus
 */
@Local
public interface ProcedimientosFacadeLocal {

    void create(Procedimientos procedimientos);

    void edit(Procedimientos procedimientos);

    void remove(Procedimientos procedimientos);

    Procedimientos find(Object id);

    List<Procedimientos> findAll();

    List<Procedimientos> findRange(int[] range);

    int count();
    
}
