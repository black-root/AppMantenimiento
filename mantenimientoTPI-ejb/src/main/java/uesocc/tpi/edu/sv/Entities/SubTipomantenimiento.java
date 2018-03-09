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
@Table(name = "sub_tipomantenimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SubTipomantenimiento.findAll", query = "SELECT s FROM SubTipomantenimiento s")
    , @NamedQuery(name = "SubTipomantenimiento.findByPkIdsubTipomantenimiento", query = "SELECT s FROM SubTipomantenimiento s WHERE s.pkIdsubTipomantenimiento = :pkIdsubTipomantenimiento")
    , @NamedQuery(name = "SubTipomantenimiento.findByDescripcion", query = "SELECT s FROM SubTipomantenimiento s WHERE s.descripcion = :descripcion")})
public class SubTipomantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idsub_tipomantenimiento")
    private Integer pkIdsubTipomantenimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdsubTipomantenimiento", fetch = FetchType.LAZY)
    private List<Tipomantenimiento> tipomantenimientoList;

    public SubTipomantenimiento() {
    }

    public SubTipomantenimiento(Integer pkIdsubTipomantenimiento) {
        this.pkIdsubTipomantenimiento = pkIdsubTipomantenimiento;
    }

    public SubTipomantenimiento(Integer pkIdsubTipomantenimiento, String descripcion) {
        this.pkIdsubTipomantenimiento = pkIdsubTipomantenimiento;
        this.descripcion = descripcion;
    }

    public Integer getPkIdsubTipomantenimiento() {
        return pkIdsubTipomantenimiento;
    }

    public void setPkIdsubTipomantenimiento(Integer pkIdsubTipomantenimiento) {
        this.pkIdsubTipomantenimiento = pkIdsubTipomantenimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Tipomantenimiento> getTipomantenimientoList() {
        return tipomantenimientoList;
    }

    public void setTipomantenimientoList(List<Tipomantenimiento> tipomantenimientoList) {
        this.tipomantenimientoList = tipomantenimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdsubTipomantenimiento != null ? pkIdsubTipomantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SubTipomantenimiento)) {
            return false;
        }
        SubTipomantenimiento other = (SubTipomantenimiento) object;
        if ((this.pkIdsubTipomantenimiento == null && other.pkIdsubTipomantenimiento != null) || (this.pkIdsubTipomantenimiento != null && !this.pkIdsubTipomantenimiento.equals(other.pkIdsubTipomantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.SubTipomantenimiento[ pkIdsubTipomantenimiento=" + pkIdsubTipomantenimiento + " ]";
    }
    
}
