/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "ordentrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordentrabajo.findAll", query = "SELECT o FROM Ordentrabajo o")
    , @NamedQuery(name = "Ordentrabajo.findByPkIdordentrabajo", query = "SELECT o FROM Ordentrabajo o WHERE o.pkIdordentrabajo = :pkIdordentrabajo")
    , @NamedQuery(name = "Ordentrabajo.findBySolicituddescripcion", query = "SELECT o FROM Ordentrabajo o WHERE o.solicituddescripcion = :solicituddescripcion")
    , @NamedQuery(name = "Ordentrabajo.findBySolicitudfecha", query = "SELECT o FROM Ordentrabajo o WHERE o.solicitudfecha = :solicitudfecha")
    , @NamedQuery(name = "Ordentrabajo.findByClientenombre", query = "SELECT o FROM Ordentrabajo o WHERE o.clientenombre = :clientenombre")
    , @NamedQuery(name = "Ordentrabajo.findByClienteemail", query = "SELECT o FROM Ordentrabajo o WHERE o.clienteemail = :clienteemail")
    , @NamedQuery(name = "Ordentrabajo.findByClientetelefono", query = "SELECT o FROM Ordentrabajo o WHERE o.clientetelefono = :clientetelefono")
    , @NamedQuery(name = "Ordentrabajo.findByClientedomicilio", query = "SELECT o FROM Ordentrabajo o WHERE o.clientedomicilio = :clientedomicilio")
    , @NamedQuery(name = "Ordentrabajo.findByEstado", query = "SELECT o FROM Ordentrabajo o WHERE o.estado = :estado")
    , @NamedQuery(name = "Ordentrabajo.findByOrdentrabajoaprobadafecha", query = "SELECT o FROM Ordentrabajo o WHERE o.ordentrabajoaprobadafecha = :ordentrabajoaprobadafecha")
    , @NamedQuery(name = "Ordentrabajo.findByTecnicodiagnostico", query = "SELECT o FROM Ordentrabajo o WHERE o.tecnicodiagnostico = :tecnicodiagnostico")
    , @NamedQuery(name = "Ordentrabajo.findByPosiblefechaentrega", query = "SELECT o FROM Ordentrabajo o WHERE o.posiblefechaentrega = :posiblefechaentrega")})
public class Ordentrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idordentrabajo")
    private Integer pkIdordentrabajo;
    @Size(max = 2147483647)
    @Column(name = "solicituddescripcion")
    private String solicituddescripcion;
    @Column(name = "solicitudfecha")
    @Temporal(TemporalType.DATE)
    private Date solicitudfecha;
    @Size(max = 45)
    @Column(name = "clientenombre")
    private String clientenombre;
    @Size(max = 45)
    @Column(name = "clienteemail")
    private String clienteemail;
    @Size(max = 15)
    @Column(name = "clientetelefono")
    private String clientetelefono;
    @Size(max = 45)
    @Column(name = "clientedomicilio")
    private String clientedomicilio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Column(name = "ordentrabajoaprobadafecha")
    @Temporal(TemporalType.DATE)
    private Date ordentrabajoaprobadafecha;
    @Size(max = 2147483647)
    @Column(name = "tecnicodiagnostico")
    private String tecnicodiagnostico;
    @Column(name = "posiblefechaentrega")
    @Temporal(TemporalType.DATE)
    private Date posiblefechaentrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordentrabajo", fetch = FetchType.LAZY)
    private List<MantenimientoDetalle> mantenimientoDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdordentrabajo", fetch = FetchType.LAZY)
    private List<DianosticoParte> dianosticoParteList;
    @JoinColumn(name = "fk_idnoserie", referencedColumnName = "pk_idnoserie")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo fkIdnoserie;
    @JoinColumn(name = "fk_idprioridad", referencedColumnName = "pk_idprioridad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Prioridad fkIdprioridad;
    @JoinColumn(name = "fk_idorigensolicitud", referencedColumnName = "pk_idsolicitud")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Solicitud fkIdorigensolicitud;
    @JoinColumn(name = "fk_idtipomantenimiento", referencedColumnName = "pk_idtipomantenimiento")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Tipomantenimiento fkIdtipomantenimiento;
    @JoinColumn(name = "fk_idunidad", referencedColumnName = "pk_idunidad")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Unidad fkIdunidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdordentrabajo", fetch = FetchType.LAZY)
    private List<Diagnostico> diagnosticoList;

    public Ordentrabajo() {
    }

    public Ordentrabajo(Integer pkIdordentrabajo) {
        this.pkIdordentrabajo = pkIdordentrabajo;
    }

    public Ordentrabajo(Integer pkIdordentrabajo, boolean estado) {
        this.pkIdordentrabajo = pkIdordentrabajo;
        this.estado = estado;
    }

    public Integer getPkIdordentrabajo() {
        return pkIdordentrabajo;
    }

    public void setPkIdordentrabajo(Integer pkIdordentrabajo) {
        this.pkIdordentrabajo = pkIdordentrabajo;
    }

    public String getSolicituddescripcion() {
        return solicituddescripcion;
    }

    public void setSolicituddescripcion(String solicituddescripcion) {
        this.solicituddescripcion = solicituddescripcion;
    }

    public Date getSolicitudfecha() {
        return solicitudfecha;
    }

    public void setSolicitudfecha(Date solicitudfecha) {
        this.solicitudfecha = solicitudfecha;
    }

    public String getClientenombre() {
        return clientenombre;
    }

    public void setClientenombre(String clientenombre) {
        this.clientenombre = clientenombre;
    }

    public String getClienteemail() {
        return clienteemail;
    }

    public void setClienteemail(String clienteemail) {
        this.clienteemail = clienteemail;
    }

    public String getClientetelefono() {
        return clientetelefono;
    }

    public void setClientetelefono(String clientetelefono) {
        this.clientetelefono = clientetelefono;
    }

    public String getClientedomicilio() {
        return clientedomicilio;
    }

    public void setClientedomicilio(String clientedomicilio) {
        this.clientedomicilio = clientedomicilio;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getOrdentrabajoaprobadafecha() {
        return ordentrabajoaprobadafecha;
    }

    public void setOrdentrabajoaprobadafecha(Date ordentrabajoaprobadafecha) {
        this.ordentrabajoaprobadafecha = ordentrabajoaprobadafecha;
    }

    public String getTecnicodiagnostico() {
        return tecnicodiagnostico;
    }

    public void setTecnicodiagnostico(String tecnicodiagnostico) {
        this.tecnicodiagnostico = tecnicodiagnostico;
    }

    public Date getPosiblefechaentrega() {
        return posiblefechaentrega;
    }

    public void setPosiblefechaentrega(Date posiblefechaentrega) {
        this.posiblefechaentrega = posiblefechaentrega;
    }

    @XmlTransient
    public List<MantenimientoDetalle> getMantenimientoDetalleList() {
        return mantenimientoDetalleList;
    }

    public void setMantenimientoDetalleList(List<MantenimientoDetalle> mantenimientoDetalleList) {
        this.mantenimientoDetalleList = mantenimientoDetalleList;
    }

    @XmlTransient
    public List<DianosticoParte> getDianosticoParteList() {
        return dianosticoParteList;
    }

    public void setDianosticoParteList(List<DianosticoParte> dianosticoParteList) {
        this.dianosticoParteList = dianosticoParteList;
    }

    public Equipo getFkIdnoserie() {
        return fkIdnoserie;
    }

    public void setFkIdnoserie(Equipo fkIdnoserie) {
        this.fkIdnoserie = fkIdnoserie;
    }

    public Prioridad getFkIdprioridad() {
        return fkIdprioridad;
    }

    public void setFkIdprioridad(Prioridad fkIdprioridad) {
        this.fkIdprioridad = fkIdprioridad;
    }

    public Solicitud getFkIdorigensolicitud() {
        return fkIdorigensolicitud;
    }

    public void setFkIdorigensolicitud(Solicitud fkIdorigensolicitud) {
        this.fkIdorigensolicitud = fkIdorigensolicitud;
    }

    public Tipomantenimiento getFkIdtipomantenimiento() {
        return fkIdtipomantenimiento;
    }

    public void setFkIdtipomantenimiento(Tipomantenimiento fkIdtipomantenimiento) {
        this.fkIdtipomantenimiento = fkIdtipomantenimiento;
    }

    public Unidad getFkIdunidad() {
        return fkIdunidad;
    }

    public void setFkIdunidad(Unidad fkIdunidad) {
        this.fkIdunidad = fkIdunidad;
    }

    @XmlTransient
    public List<Diagnostico> getDiagnosticoList() {
        return diagnosticoList;
    }

    public void setDiagnosticoList(List<Diagnostico> diagnosticoList) {
        this.diagnosticoList = diagnosticoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdordentrabajo != null ? pkIdordentrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordentrabajo)) {
            return false;
        }
        Ordentrabajo other = (Ordentrabajo) object;
        if ((this.pkIdordentrabajo == null && other.pkIdordentrabajo != null) || (this.pkIdordentrabajo != null && !this.pkIdordentrabajo.equals(other.pkIdordentrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Ordentrabajo[ pkIdordentrabajo=" + pkIdordentrabajo + " ]";
    }
    
}
