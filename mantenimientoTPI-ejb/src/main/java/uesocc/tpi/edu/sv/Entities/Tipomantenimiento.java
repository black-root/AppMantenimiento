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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tipomantenimiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipomantenimiento.findAll", query = "SELECT t FROM Tipomantenimiento t")
    , @NamedQuery(name = "Tipomantenimiento.findByPkIdtipomantenimiento", query = "SELECT t FROM Tipomantenimiento t WHERE t.pkIdtipomantenimiento = :pkIdtipomantenimiento")
    , @NamedQuery(name = "Tipomantenimiento.findByDescripcion", query = "SELECT t FROM Tipomantenimiento t WHERE t.descripcion = :descripcion")})
public class Tipomantenimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idtipomantenimiento")
    private Integer pkIdtipomantenimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdtipomantenimiento", fetch = FetchType.LAZY)
    private List<Ordentrabajo> ordentrabajoList;
    @JoinColumn(name = "fk_idsub_tipomantenimiento", referencedColumnName = "pk_idsub_tipomantenimiento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private SubTipomantenimiento fkIdsubTipomantenimiento;

    public Tipomantenimiento() {
    }

    public Tipomantenimiento(Integer pkIdtipomantenimiento) {
        this.pkIdtipomantenimiento = pkIdtipomantenimiento;
    }

    public Tipomantenimiento(Integer pkIdtipomantenimiento, String descripcion) {
        this.pkIdtipomantenimiento = pkIdtipomantenimiento;
        this.descripcion = descripcion;
    }

    public Integer getPkIdtipomantenimiento() {
        return pkIdtipomantenimiento;
    }

    public void setPkIdtipomantenimiento(Integer pkIdtipomantenimiento) {
        this.pkIdtipomantenimiento = pkIdtipomantenimiento;
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

    public SubTipomantenimiento getFkIdsubTipomantenimiento() {
        return fkIdsubTipomantenimiento;
    }

    public void setFkIdsubTipomantenimiento(SubTipomantenimiento fkIdsubTipomantenimiento) {
        this.fkIdsubTipomantenimiento = fkIdsubTipomantenimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdtipomantenimiento != null ? pkIdtipomantenimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipomantenimiento)) {
            return false;
        }
        Tipomantenimiento other = (Tipomantenimiento) object;
        if ((this.pkIdtipomantenimiento == null && other.pkIdtipomantenimiento != null) || (this.pkIdtipomantenimiento != null && !this.pkIdtipomantenimiento.equals(other.pkIdtipomantenimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Tipomantenimiento[ pkIdtipomantenimiento=" + pkIdtipomantenimiento + " ]";
    }
    
}
