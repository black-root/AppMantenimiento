/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "calendario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calendario.findAll", query = "SELECT c FROM Calendario c")
    , @NamedQuery(name = "Calendario.findByIdcalendario", query = "SELECT c FROM Calendario c WHERE c.idcalendario = :idcalendario")
    , @NamedQuery(name = "Calendario.findByFechaMantenimiento", query = "SELECT c FROM Calendario c WHERE c.fechaMantenimiento = :fechaMantenimiento")
    , @NamedQuery(name = "Calendario.findByExcepcion", query = "SELECT c FROM Calendario c WHERE c.excepcion = :excepcion")})
public class Calendario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcalendario")
    private Integer idcalendario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_mantenimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaMantenimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "excepcion")
    private boolean excepcion;

    public Calendario() {
    }

    public Calendario(Integer idcalendario) {
        this.idcalendario = idcalendario;
    }

    public Calendario(Integer idcalendario, Date fechaMantenimiento, boolean excepcion) {
        this.idcalendario = idcalendario;
        this.fechaMantenimiento = fechaMantenimiento;
        this.excepcion = excepcion;
    }

    public Integer getIdcalendario() {
        return idcalendario;
    }

    public void setIdcalendario(Integer idcalendario) {
        this.idcalendario = idcalendario;
    }

    public Date getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public boolean getExcepcion() {
        return excepcion;
    }

    public void setExcepcion(boolean excepcion) {
        this.excepcion = excepcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcalendario != null ? idcalendario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calendario)) {
            return false;
        }
        Calendario other = (Calendario) object;
        if ((this.idcalendario == null && other.idcalendario != null) || (this.idcalendario != null && !this.idcalendario.equals(other.idcalendario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Calendario[ idcalendario=" + idcalendario + " ]";
    }
    
}
