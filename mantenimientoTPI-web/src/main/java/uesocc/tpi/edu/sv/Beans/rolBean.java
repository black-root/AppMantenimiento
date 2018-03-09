/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Beans;

import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import uesocc.tpi.edu.sv.Entities.Rol;

/**
 *
 * @author yisus
 */
@Named(value = "rolBean")
@RequestScoped
public class rolBean {

    @EJB
    private uesocc.tpi.edu.sv.Services.RolFacadeLocal rolFacade;

    /**
     * Creates a new instance of rolBean
     */
    public rolBean() {
    }
    public List<Rol> getRol(){
        return rolFacade.findAll();
    }
    
}
