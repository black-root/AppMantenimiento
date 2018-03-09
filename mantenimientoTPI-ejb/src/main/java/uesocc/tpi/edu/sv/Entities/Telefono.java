/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "telefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefono.findAll", query = "SELECT t FROM Telefono t")
    , @NamedQuery(name = "Telefono.findByPkIdtelefono", query = "SELECT t FROM Telefono t WHERE t.pkIdtelefono = :pkIdtelefono")
    , @NamedQuery(name = "Telefono.findByTelefono", query = "SELECT t FROM Telefono t WHERE t.telefono = :telefono")})
public class Telefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idtelefono")
    private Integer pkIdtelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "telefono")
    private String telefono;
    @JoinColumn(name = "fk_idpersonal", referencedColumnName = "pk_idpersonal")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal fkIdpersonal;

    public Telefono() {
    }

    public Telefono(Integer pkIdtelefono) {
        this.pkIdtelefono = pkIdtelefono;
    }

    public Telefono(Integer pkIdtelefono, String telefono) {
        this.pkIdtelefono = pkIdtelefono;
        this.telefono = telefono;
    }

    public Integer getPkIdtelefono() {
        return pkIdtelefono;
    }

    public void setPkIdtelefono(Integer pkIdtelefono) {
        this.pkIdtelefono = pkIdtelefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Personal getFkIdpersonal() {
        return fkIdpersonal;
    }

    public void setFkIdpersonal(Personal fkIdpersonal) {
        this.fkIdpersonal = fkIdpersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdtelefono != null ? pkIdtelefono.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Telefono)) {
            return false;
        }
        Telefono other = (Telefono) object;
        if ((this.pkIdtelefono == null && other.pkIdtelefono != null) || (this.pkIdtelefono != null && !this.pkIdtelefono.equals(other.pkIdtelefono))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Telefono[ pkIdtelefono=" + pkIdtelefono + " ]";
    }
    
}
