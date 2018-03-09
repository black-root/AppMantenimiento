/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "estado_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoDetalle.findAll", query = "SELECT e FROM EstadoDetalle e")
    , @NamedQuery(name = "EstadoDetalle.findByPkIdestado", query = "SELECT e FROM EstadoDetalle e WHERE e.estadoDetallePK.pkIdestado = :pkIdestado")
    , @NamedQuery(name = "EstadoDetalle.findByPkIdpersonal", query = "SELECT e FROM EstadoDetalle e WHERE e.estadoDetallePK.pkIdpersonal = :pkIdpersonal")
    , @NamedQuery(name = "EstadoDetalle.findByPkIddianosticoParte", query = "SELECT e FROM EstadoDetalle e WHERE e.estadoDetallePK.pkIddianosticoParte = :pkIddianosticoParte")
    , @NamedQuery(name = "EstadoDetalle.findByPkIdpaso", query = "SELECT e FROM EstadoDetalle e WHERE e.estadoDetallePK.pkIdpaso = :pkIdpaso")
    , @NamedQuery(name = "EstadoDetalle.findByPkIdtipoProcedimiento", query = "SELECT e FROM EstadoDetalle e WHERE e.estadoDetallePK.pkIdtipoProcedimiento = :pkIdtipoProcedimiento")})
public class EstadoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EstadoDetallePK estadoDetallePK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoDetalle", fetch = FetchType.LAZY)
    private List<MantenimientoDetalle> mantenimientoDetalleList;
    @JoinColumn(name = "pk_idestado", referencedColumnName = "pk_idestado", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estado estado;
    @JoinColumn(name = "pk_idpersonal", referencedColumnName = "pk_idpersonal", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Personal personal;
    @JoinColumns({
        @JoinColumn(name = "pk_iddianostico_parte", referencedColumnName = "pk_iddianostico_parte", insertable = false, updatable = false)
        , @JoinColumn(name = "pk_idpaso", referencedColumnName = "pk_idpaso", insertable = false, updatable = false)
        , @JoinColumn(name = "pk_idtipo_procedimiento", referencedColumnName = "pk_idtipo_procedimiento", insertable = false, updatable = false)})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Procedimientos procedimientos;

    public EstadoDetalle() {
    }

    public EstadoDetalle(EstadoDetallePK estadoDetallePK) {
        this.estadoDetallePK = estadoDetallePK;
    }

    public EstadoDetalle(int pkIdestado, int pkIdpersonal, int pkIddianosticoParte, int pkIdpaso, int pkIdtipoProcedimiento) {
        this.estadoDetallePK = new EstadoDetallePK(pkIdestado, pkIdpersonal, pkIddianosticoParte, pkIdpaso, pkIdtipoProcedimiento);
    }

    public EstadoDetallePK getEstadoDetallePK() {
        return estadoDetallePK;
    }

    public void setEstadoDetallePK(EstadoDetallePK estadoDetallePK) {
        this.estadoDetallePK = estadoDetallePK;
    }

    @XmlTransient
    public List<MantenimientoDetalle> getMantenimientoDetalleList() {
        return mantenimientoDetalleList;
    }

    public void setMantenimientoDetalleList(List<MantenimientoDetalle> mantenimientoDetalleList) {
        this.mantenimientoDetalleList = mantenimientoDetalleList;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Procedimientos getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(Procedimientos procedimientos) {
        this.procedimientos = procedimientos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (estadoDetallePK != null ? estadoDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoDetalle)) {
            return false;
        }
        EstadoDetalle other = (EstadoDetalle) object;
        if ((this.estadoDetallePK == null && other.estadoDetallePK != null) || (this.estadoDetallePK != null && !this.estadoDetallePK.equals(other.estadoDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.EstadoDetalle[ estadoDetallePK=" + estadoDetallePK + " ]";
    }
    
}
