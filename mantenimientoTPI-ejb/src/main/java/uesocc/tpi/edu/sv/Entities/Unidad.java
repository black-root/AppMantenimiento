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
@Table(name = "unidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Unidad.findAll", query = "SELECT u FROM Unidad u")
    , @NamedQuery(name = "Unidad.findByPkIdunidad", query = "SELECT u FROM Unidad u WHERE u.pkIdunidad = :pkIdunidad")
    , @NamedQuery(name = "Unidad.findByUnidadnombre", query = "SELECT u FROM Unidad u WHERE u.unidadnombre = :unidadnombre")
    , @NamedQuery(name = "Unidad.findByDescripcion", query = "SELECT u FROM Unidad u WHERE u.descripcion = :descripcion")})
public class Unidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idunidad")
    private Integer pkIdunidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unidadnombre")
    private String unidadnombre;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdunidad", fetch = FetchType.LAZY)
    private List<Ordentrabajo> ordentrabajoList;

    public Unidad() {
    }

    public Unidad(Integer pkIdunidad) {
        this.pkIdunidad = pkIdunidad;
    }

    public Unidad(Integer pkIdunidad, String unidadnombre) {
        this.pkIdunidad = pkIdunidad;
        this.unidadnombre = unidadnombre;
    }

    public Integer getPkIdunidad() {
        return pkIdunidad;
    }

    public void setPkIdunidad(Integer pkIdunidad) {
        this.pkIdunidad = pkIdunidad;
    }

    public String getUnidadnombre() {
        return unidadnombre;
    }

    public void setUnidadnombre(String unidadnombre) {
        this.unidadnombre = unidadnombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (pkIdunidad != null ? pkIdunidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unidad)) {
            return false;
        }
        Unidad other = (Unidad) object;
        if ((this.pkIdunidad == null && other.pkIdunidad != null) || (this.pkIdunidad != null && !this.pkIdunidad.equals(other.pkIdunidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Unidad[ pkIdunidad=" + pkIdunidad + " ]";
    }
    
}
