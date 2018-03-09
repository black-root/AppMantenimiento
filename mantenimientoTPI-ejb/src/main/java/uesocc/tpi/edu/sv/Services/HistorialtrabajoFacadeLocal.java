/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Historialtrabajo;

/**
 *
 * @author yisus
 */
@Local
public interface HistorialtrabajoFacadeLocal {

    void create(Historialtrabajo historialtrabajo);

    void edit(Historialtrabajo historialtrabajo);

    void remove(Historialtrabajo historialtrabajo);

    Historialtrabajo find(Object id);

    List<Historialtrabajo> findAll();

    List<Historialtrabajo> findRange(int[] range);

    int count();
    
}
