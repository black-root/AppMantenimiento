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
@Table(name = "prioridad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prioridad.findAll", query = "SELECT p FROM Prioridad p")
    , @NamedQuery(name = "Prioridad.findByPkIdprioridad", query = "SELECT p FROM Prioridad p WHERE p.pkIdprioridad = :pkIdprioridad")
    , @NamedQuery(name = "Prioridad.findByPrioridadnivel", query = "SELECT p FROM Prioridad p WHERE p.prioridadnivel = :prioridadnivel")})
public class Prioridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idprioridad")
    private Integer pkIdprioridad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "prioridadnivel")
    private String prioridadnivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdprioridad", fetch = FetchType.LAZY)
    private List<Ordentrabajo> ordentrabajoList;

    public Prioridad() {
    }

    public Prioridad(Integer pkIdprioridad) {
        this.pkIdprioridad = pkIdprioridad;
    }

    public Prioridad(Integer pkIdprioridad, String prioridadnivel) {
        this.pkIdprioridad = pkIdprioridad;
        this.prioridadnivel = prioridadnivel;
    }

    public Integer getPkIdprioridad() {
        return pkIdprioridad;
    }

    public void setPkIdprioridad(Integer pkIdprioridad) {
        this.pkIdprioridad = pkIdprioridad;
    }

    public String getPrioridadnivel() {
        return prioridadnivel;
    }

    public void setPrioridadnivel(String prioridadnivel) {
        this.prioridadnivel = prioridadnivel;
    }

    @XmlTransient
    public List<Ordentrabajo> getOrdentrabajoList() {
        return ordentrabajoList;
    }

    public void setOrdentrabajoList(List<Ordentrabajo> ordentrabajoList) {
        this.ordentrabajoList = ordentrabajoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdprioridad != null ? pkIdprioridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prioridad)) {
            return false;
        }
        Prioridad other = (Prioridad) object;
        if ((this.pkIdprioridad == null && other.pkIdprioridad != null) || (this.pkIdprioridad != null && !this.pkIdprioridad.equals(other.pkIdprioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Prioridad[ pkIdprioridad=" + pkIdprioridad + " ]";
    }
    
}
