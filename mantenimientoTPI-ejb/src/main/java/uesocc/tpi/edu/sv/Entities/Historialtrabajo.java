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
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "historialtrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historialtrabajo.findAll", query = "SELECT h FROM Historialtrabajo h")
    , @NamedQuery(name = "Historialtrabajo.findByPkIdhistorialtrabajo", query = "SELECT h FROM Historialtrabajo h WHERE h.pkIdhistorialtrabajo = :pkIdhistorialtrabajo")
    , @NamedQuery(name = "Historialtrabajo.findByFechainicio", query = "SELECT h FROM Historialtrabajo h WHERE h.fechainicio = :fechainicio")
    , @NamedQuery(name = "Historialtrabajo.findByFechafin", query = "SELECT h FROM Historialtrabajo h WHERE h.fechafin = :fechafin")})
public class Historialtrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idhistorialtrabajo")
    private Integer pkIdhistorialtrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechainicio")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Column(name = "fechafin")
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    @JoinColumn(name = "fk_idpersonal", referencedColumnName = "pk_idpersonal")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal fkIdpersonal;
    @JoinColumn(name = "fk_idtrabajo", referencedColumnName = "pk_idtrabajo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol fkIdtrabajo;

    public Historialtrabajo() {
    }

    public Historialtrabajo(Integer pkIdhistorialtrabajo) {
        this.pkIdhistorialtrabajo = pkIdhistorialtrabajo;
    }

    public Historialtrabajo(Integer pkIdhistorialtrabajo, Date fechainicio) {
        this.pkIdhistorialtrabajo = pkIdhistorialtrabajo;
        this.fechainicio = fechainicio;
    }

    public Integer getPkIdhistorialtrabajo() {
        return pkIdhistorialtrabajo;
    }

    public void setPkIdhistorialtrabajo(Integer pkIdhistorialtrabajo) {
        this.pkIdhistorialtrabajo = pkIdhistorialtrabajo;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public Personal getFkIdpersonal() {
        return fkIdpersonal;
    }

    public void setFkIdpersonal(Personal fkIdpersonal) {
        this.fkIdpersonal = fkIdpersonal;
    }

    public Rol getFkIdtrabajo() {
        return fkIdtrabajo;
    }

    public void setFkIdtrabajo(Rol fkIdtrabajo) {
        this.fkIdtrabajo = fkIdtrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdhistorialtrabajo != null ? pkIdhistorialtrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historialtrabajo)) {
            return false;
        }
        Historialtrabajo other = (Historialtrabajo) object;
        if ((this.pkIdhistorialtrabajo == null && other.pkIdhistorialtrabajo != null) || (this.pkIdhistorialtrabajo != null && !this.pkIdhistorialtrabajo.equals(other.pkIdhistorialtrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Historialtrabajo[ pkIdhistorialtrabajo=" + pkIdhistorialtrabajo + " ]";
    }
    
}
