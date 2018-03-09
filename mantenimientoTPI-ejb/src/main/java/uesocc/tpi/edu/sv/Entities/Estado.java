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
@Table(name = "estado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estado.findAll", query = "SELECT e FROM Estado e")
    , @NamedQuery(name = "Estado.findByPkIdestado", query = "SELECT e FROM Estado e WHERE e.pkIdestado = :pkIdestado")
    , @NamedQuery(name = "Estado.findByEstadonombre", query = "SELECT e FROM Estado e WHERE e.estadonombre = :estadonombre")
    , @NamedQuery(name = "Estado.findByDescripcion", query = "SELECT e FROM Estado e WHERE e.descripcion = :descripcion")})
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idestado")
    private Integer pkIdestado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estadonombre")
    private String estadonombre;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estado", fetch = FetchType.LAZY)
    private List<EstadoDetalle> estadoDetalleList;

    public Estado() {
    }

    public Estado(Integer pkIdestado) {
        this.pkIdestado = pkIdestado;
    }

    public Estado(Integer pkIdestado, String estadonombre) {
        this.pkIdestado = pkIdestado;
        this.estadonombre = estadonombre;
    }

    public Integer getPkIdestado() {
        return pkIdestado;
    }

    public void setPkIdestado(Integer pkIdestado) {
        this.pkIdestado = pkIdestado;
    }

    public String getEstadonombre() {
        return estadonombre;
    }

    public void setEstadonombre(String estadonombre) {
        this.estadonombre = estadonombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<EstadoDetalle> getEstadoDetalleList() {
        return estadoDetalleList;
    }

    public void setEstadoDetalleList(List<EstadoDetalle> estadoDetalleList) {
        this.estadoDetalleList = estadoDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdestado != null ? pkIdestado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estado)) {
            return false;
        }
        Estado other = (Estado) object;
        if ((this.pkIdestado == null && other.pkIdestado != null) || (this.pkIdestado != null && !this.pkIdestado.equals(other.pkIdestado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Estado[ pkIdestado=" + pkIdestado + " ]";
    }
    
}
