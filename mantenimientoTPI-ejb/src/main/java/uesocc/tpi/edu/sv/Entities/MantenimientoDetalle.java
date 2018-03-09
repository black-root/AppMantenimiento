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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "mantenimiento_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MantenimientoDetalle.findAll", query = "SELECT m FROM MantenimientoDetalle m")
    , @NamedQuery(name = "MantenimientoDetalle.findByPkIdmantenimientoDetallecol", query = "SELECT m FROM MantenimientoDetalle m WHERE m.mantenimientoDetallePK.pkIdmantenimientoDetallecol = :pkIdmantenimientoDetallecol")
    , @NamedQuery(name = "MantenimientoDetalle.findByPkIdordentrabajo", query = "SELECT m FROM MantenimientoDetalle m WHERE m.mantenimientoDetallePK.pkIdordentrabajo = :pkIdordentrabajo")
    , @NamedQuery(name = "MantenimientoDetalle.findByObservaciones", query = "SELECT m FROM MantenimientoDetalle m WHERE m.observaciones = :observaciones")
    , @NamedQuery(name = "MantenimientoDetalle.findByFecha", query = "SELECT m FROM MantenimientoDetalle m WHERE m.fecha = :fecha")})
public class MantenimientoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MantenimientoDetallePK mantenimientoDetallePK;
    @Size(max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "fk_idnoserie", referencedColumnName = "pk_idnoserie")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo fkIdnoserie;
    @JoinColumns({
        @JoinColumn(name = "fk_idestado", referencedColumnName = "pk_idestado")
        , @JoinColumn(name = "fk_idpersonal", referencedColumnName = "pk_idpersonal")
        , @JoinColumn(name = "fk_iddianostico_parte", referencedColumnName = "pk_iddianostico_parte")
        , @JoinColumn(name = "fk_idpaso", referencedColumnName = "pk_idpaso")
        , @JoinColumn(name = "fk_idtipo_procedimiento", referencedColumnName = "pk_idtipo_procedimiento")})
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EstadoDetalle estadoDetalle;
    @JoinColumn(name = "pk_idordentrabajo", referencedColumnName = "pk_idordentrabajo", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordentrabajo ordentrabajo;

    public MantenimientoDetalle() {
    }

    public MantenimientoDetalle(MantenimientoDetallePK mantenimientoDetallePK) {
        this.mantenimientoDetallePK = mantenimientoDetallePK;
    }

    public MantenimientoDetalle(MantenimientoDetallePK mantenimientoDetallePK, Date fecha) {
        this.mantenimientoDetallePK = mantenimientoDetallePK;
        this.fecha = fecha;
    }

    public MantenimientoDetalle(int pkIdmantenimientoDetallecol, int pkIdordentrabajo) {
        this.mantenimientoDetallePK = new MantenimientoDetallePK(pkIdmantenimientoDetallecol, pkIdordentrabajo);
    }

    public MantenimientoDetallePK getMantenimientoDetallePK() {
        return mantenimientoDetallePK;
    }

    public void setMantenimientoDetallePK(MantenimientoDetallePK mantenimientoDetallePK) {
        this.mantenimientoDetallePK = mantenimientoDetallePK;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getFkIdnoserie() {
        return fkIdnoserie;
    }

    public void setFkIdnoserie(Equipo fkIdnoserie) {
        this.fkIdnoserie = fkIdnoserie;
    }

    public EstadoDetalle getEstadoDetalle() {
        return estadoDetalle;
    }

    public void setEstadoDetalle(EstadoDetalle estadoDetalle) {
        this.estadoDetalle = estadoDetalle;
    }

    public Ordentrabajo getOrdentrabajo() {
        return ordentrabajo;
    }

    public void setOrdentrabajo(Ordentrabajo ordentrabajo) {
        this.ordentrabajo = ordentrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mantenimientoDetallePK != null ? mantenimientoDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MantenimientoDetalle)) {
            return false;
        }
        MantenimientoDetalle other = (MantenimientoDetalle) object;
        if ((this.mantenimientoDetallePK == null && other.mantenimientoDetallePK != null) || (this.mantenimientoDetallePK != null && !this.mantenimientoDetallePK.equals(other.mantenimientoDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.MantenimientoDetalle[ mantenimientoDetallePK=" + mantenimientoDetallePK + " ]";
    }
    
}
