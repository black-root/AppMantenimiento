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
@Table(name = "pasos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pasos.findAll", query = "SELECT p FROM Pasos p")
    , @NamedQuery(name = "Pasos.findByPkIdpaso", query = "SELECT p FROM Pasos p WHERE p.pkIdpaso = :pkIdpaso")
    , @NamedQuery(name = "Pasos.findByDescripcion", query = "SELECT p FROM Pasos p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pasos.findByObservacion", query = "SELECT p FROM Pasos p WHERE p.observacion = :observacion")
    , @NamedQuery(name = "Pasos.findByDuracionPaso", query = "SELECT p FROM Pasos p WHERE p.duracionPaso = :duracionPaso")})
public class Pasos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idpaso")
    private Integer pkIdpaso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 45)
    @Column(name = "duracion_paso")
    private String duracionPaso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pasos", fetch = FetchType.LAZY)
    private List<Procedimientos> procedimientosList;

    public Pasos() {
    }

    public Pasos(Integer pkIdpaso) {
        this.pkIdpaso = pkIdpaso;
    }

    public Pasos(Integer pkIdpaso, String descripcion) {
        this.pkIdpaso = pkIdpaso;
        this.descripcion = descripcion;
    }

    public Integer getPkIdpaso() {
        return pkIdpaso;
    }

    public void setPkIdpaso(Integer pkIdpaso) {
        this.pkIdpaso = pkIdpaso;
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

    public String getDuracionPaso() {
        return duracionPaso;
    }

    public void setDuracionPaso(String duracionPaso) {
        this.duracionPaso = duracionPaso;
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
        hash += (pkIdpaso != null ? pkIdpaso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasos)) {
            return false;
        }
        Pasos other = (Pasos) object;
        if ((this.pkIdpaso == null && other.pkIdpaso != null) || (this.pkIdpaso != null && !this.pkIdpaso.equals(other.pkIdpaso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Pasos[ pkIdpaso=" + pkIdpaso + " ]";
    }
    
}
