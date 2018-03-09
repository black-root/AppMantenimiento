/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.SubTipomantenimiento;

/**
 *
 * @author yisus
 */
@Local
public interface SubTipomantenimientoFacadeLocal {

    void create(SubTipomantenimiento subTipomantenimiento);

    void edit(SubTipomantenimiento subTipomantenimiento);

    void remove(SubTipomantenimiento subTipomantenimiento);

    SubTipomantenimiento find(Object id);

    List<SubTipomantenimiento> findAll();

    List<SubTipomantenimiento> findRange(int[] range);

    int count();
    
}
