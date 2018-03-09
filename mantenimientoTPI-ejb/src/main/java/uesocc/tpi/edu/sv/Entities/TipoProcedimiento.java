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
@Table(name = "tipo_procedimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoProcedimiento.findAll", query = "SELECT t FROM TipoProcedimiento t")
    , @NamedQuery(name = "TipoProcedimiento.findByPkIdtipoProcedimiento", query = "SELECT t FROM TipoProcedimiento t WHERE t.pkIdtipoProcedimiento = :pkIdtipoProcedimiento")
    , @NamedQuery(name = "TipoProcedimiento.findByDescripcion", query = "SELECT t FROM TipoProcedimiento t WHERE t.descripcion = :descripcion")
    , @NamedQuery(name = "TipoProcedimiento.findByObservacion", query = "SELECT t FROM TipoProcedimiento t WHERE t.observacion = :observacion")})
public class TipoProcedimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idtipo_procedimiento")
    private Integer pkIdtipoProcedimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoProcedimiento", fetch = FetchType.LAZY)
    private List<Procedimientos> procedimientosList;

    public TipoProcedimiento() {
    }

    public TipoProcedimiento(Integer pkIdtipoProcedimiento) {
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
    }

    public TipoProcedimiento(Integer pkIdtipoProcedimiento, String descripcion) {
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
        this.descripcion = descripcion;
    }

    public Integer getPkIdtipoProcedimiento() {
        return pkIdtipoProcedimiento;
    }

    public void setPkIdtipoProcedimiento(Integer pkIdtipoProcedimiento) {
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @XmlTransient
    public List<Procedimientos> getProcedimientosList() {
        return procedimientosList;
    }

    public void setProcedimientosList(List<Procedimientos> procedimientosList) {
        this.procedimientosList = procedimientosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdtipoProcedimiento != null ? pkIdtipoProcedimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoProcedimiento)) {
            return false;
        }
        TipoProcedimiento other = (TipoProcedimiento) object;
        if ((this.pkIdtipoProcedimiento == null && other.pkIdtipoProcedimiento != null) || (this.pkIdtipoProcedimiento != null && !this.pkIdtipoProcedimiento.equals(other.pkIdtipoProcedimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.TipoProcedimiento[ pkIdtipoProcedimiento=" + pkIdtipoProcedimiento + " ]";
    }
    
}
