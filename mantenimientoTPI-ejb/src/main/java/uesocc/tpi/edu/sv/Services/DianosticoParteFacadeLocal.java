/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Services;

import java.util.List;
import javax.ejb.Local;
import uesocc.tpi.edu.sv.Entities.DianosticoParte;

/**
 *
 * @author yisus
 */
@Local
public interface DianosticoParteFacadeLocal {

    void create(DianosticoParte dianosticoParte);

    void edit(DianosticoParte dianosticoParte);

    void remove(DianosticoParte dianosticoParte);

    DianosticoParte find(Object id);

    List<DianosticoParte> findAll();

    List<DianosticoParte> findRange(int[] range);

    int count();
    
}
