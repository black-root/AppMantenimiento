/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.Fabricantes;

/**
 *
 * @author yisus
 */
@Local
public interface FabricantesFacadeLocal {

    void create(Fabricantes fabricantes);

    void edit(Fabricantes fabricantes);

    void remove(Fabricantes fabricantes);

    Fabricantes find(Object id);

    List<Fabricantes> findAll();

    List<Fabricantes> findRange(int[] range);

    int count();
    
}
