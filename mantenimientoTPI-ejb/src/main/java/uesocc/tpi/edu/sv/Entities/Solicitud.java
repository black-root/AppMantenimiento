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
@Table(name = "solicitud")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s")
    , @NamedQuery(name = "Solicitud.findByPkIdsolicitud", query = "SELECT s FROM Solicitud s WHERE s.pkIdsolicitud = :pkIdsolicitud")
    , @NamedQuery(name = "Solicitud.findBySolicitante", query = "SELECT s FROM Solicitud s WHERE s.solicitante = :solicitante")
    , @NamedQuery(name = "Solicitud.findByDescripcion", query = "SELECT s FROM Solicitud s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Solicitud.findByCorreo", query = "SELECT s FROM Solicitud s WHERE s.correo = :correo")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idsolicitud")
    private Integer pkIdsolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "solicitante")
    private String solicitante;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 150)
    @Column(name = "correo")
    private String correo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdorigensolicitud", fetch = FetchType.LAZY)
    private List<Ordentrabajo> ordentrabajoList;

    public Solicitud() {
    }

    public Solicitud(Integer pkIdsolicitud) {
        this.pkIdsolicitud = pkIdsolicitud;
    }

    public Solicitud(Integer pkIdsolicitud, String solicitante) {
        this.pkIdsolicitud = pkIdsolicitud;
        this.solicitante = solicitante;
    }

    public Integer getPkIdsolicitud() {
        return pkIdsolicitud;
    }

    public void setPkIdsolicitud(Integer pkIdsolicitud) {
        this.pkIdsolicitud = pkIdsolicitud;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
        hash += (pkIdsolicitud != null ? pkIdsolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.pkIdsolicitud == null && other.pkIdsolicitud != null) || (this.pkIdsolicitud != null && !this.pkIdsolicitud.equals(other.pkIdsolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Solicitud[ pkIdsolicitud=" + pkIdsolicitud + " ]";
    }
    
}
