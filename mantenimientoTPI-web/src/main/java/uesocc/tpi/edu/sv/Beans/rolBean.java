/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Beans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import uesocc.tpi.edu.sv.Entities.Rol;
import uesocc.tpi.edu.sv.Services.RolFacadeLocal;

/**
 *
 * @author yisus
 */
@Named(value = "rolBean")
@RequestScoped
public class rolBean implements Serializable{

    private int id;
    private String descripcion;
    
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
    
    public String crear(){
        Rol r = new Rol();
        r.setPkIdtrabajo(id);
        r.setDescripcion(descripcion);
        rolFacade.create(r);
        return "index";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public RolFacadeLocal getRolFacade() {
        return rolFacade;
    }

    public void setRolFacade(RolFacadeLocal rolFacade) {
        this.rolFacade = rolFacade;
    }
    
}
