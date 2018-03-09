/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Pasos;

/**
 *
 * @author yisus
 */
@Local
public interface PasosFacadeLocal {

    void create(Pasos pasos);

    void edit(Pasos pasos);

    void remove(Pasos pasos);

    Pasos find(Object id);

    List<Pasos> findAll();

    List<Pasos> findRange(int[] range);

    int count();
    
}
