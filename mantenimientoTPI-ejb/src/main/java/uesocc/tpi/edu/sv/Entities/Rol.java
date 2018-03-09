/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rol.findAll", query = "SELECT r FROM Rol r")
    , @NamedQuery(name = "Rol.findByPkIdtrabajo", query = "SELECT r FROM Rol r WHERE r.pkIdtrabajo = :pkIdtrabajo")
    , @NamedQuery(name = "Rol.findByDescripcion", query = "SELECT r FROM Rol r WHERE r.descripcion = :descripcion")})
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idtrabajo")
    private Integer pkIdtrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdtrabajo", fetch = FetchType.LAZY)
    private List<Historialtrabajo> historialtrabajoList;

    public Rol() {
    }

    public Rol(Integer pkIdtrabajo) {
        this.pkIdtrabajo = pkIdtrabajo;
    }

    public Rol(Integer pkIdtrabajo, String descripcion) {
        this.pkIdtrabajo = pkIdtrabajo;
        this.descripcion = descripcion;
    }

    public Integer getPkIdtrabajo() {
        return pkIdtrabajo;
    }

    public void setPkIdtrabajo(Integer pkIdtrabajo) {
        this.pkIdtrabajo = pkIdtrabajo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Historialtrabajo> getHistorialtrabajoList() {
        return historialtrabajoList;
    }

    public void setHistorialtrabajoList(List<Historialtrabajo> historialtrabajoList) {
        this.historialtrabajoList = historialtrabajoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdtrabajo != null ? pkIdtrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.pkIdtrabajo == null && other.pkIdtrabajo != null) || (this.pkIdtrabajo != null && !this.pkIdtrabajo.equals(other.pkIdtrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Rol[ pkIdtrabajo=" + pkIdtrabajo + " ]";
    }
    
}
