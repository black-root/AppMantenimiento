/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "procedimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimientos.findAll", query = "SELECT p FROM Procedimientos p")
    , @NamedQuery(name = "Procedimientos.findByPkIddianosticoParte", query = "SELECT p FROM Procedimientos p WHERE p.procedimientosPK.pkIddianosticoParte = :pkIddianosticoParte")
    , @NamedQuery(name = "Procedimientos.findByPkIdpaso", query = "SELECT p FROM Procedimientos p WHERE p.procedimientosPK.pkIdpaso = :pkIdpaso")
    , @NamedQuery(name = "Procedimientos.findByPkIdtipoProcedimiento", query = "SELECT p FROM Procedimientos p WHERE p.procedimientosPK.pkIdtipoProcedimiento = :pkIdtipoProcedimiento")
    , @NamedQuery(name = "Procedimientos.findByNombreProcedimiento", query = "SELECT p FROM Procedimientos p WHERE p.nombreProcedimiento = :nombreProcedimiento")})
public class Procedimientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProcedimientosPK procedimientosPK;
    @Size(max = 100)
    @Column(name = "nombre_procedimiento")
    private String nombreProcedimiento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "procedimientos", fetch = FetchType.LAZY)
    private List<EstadoDetalle> estadoDetalleList;
    @JoinColumn(name = "pk_iddianostico_parte", referencedColumnName = "pk_iddianostico_parte", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private DianosticoParte dianosticoParte;
    @JoinColumn(name = "pk_idpaso", referencedColumnName = "pk_idpaso", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Pasos pasos;
    @JoinColumn(name = "pk_idtipo_procedimiento", referencedColumnName = "pk_idtipo_procedimiento", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoProcedimiento tipoProcedimiento;

    public Procedimientos() {
    }

    public Procedimientos(ProcedimientosPK procedimientosPK) {
        this.procedimientosPK = procedimientosPK;
    }

    public Procedimientos(int pkIddianosticoParte, int pkIdpaso, int pkIdtipoProcedimiento) {
        this.procedimientosPK = new ProcedimientosPK(pkIddianosticoParte, pkIdpaso, pkIdtipoProcedimiento);
    }

    public ProcedimientosPK getProcedimientosPK() {
        return procedimientosPK;
    }

    public void setProcedimientosPK(ProcedimientosPK procedimientosPK) {
        this.procedimientosPK = procedimientosPK;
    }

    public String getNombreProcedimiento() {
        return nombreProcedimiento;
    }

    public void setNombreProcedimiento(String nombreProcedimiento) {
        this.nombreProcedimiento = nombreProcedimiento;
    }

    @XmlTransient
    public List<EstadoDetalle> getEstadoDetalleList() {
        return estadoDetalleList;
    }

    public void setEstadoDetalleList(List<EstadoDetalle> estadoDetalleList) {
        this.estadoDetalleList = estadoDetalleList;
    }

    public DianosticoParte getDianosticoParte() {
        return dianosticoParte;
    }

    public void setDianosticoParte(DianosticoParte dianosticoParte) {
        this.dianosticoParte = dianosticoParte;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }

    public TipoProcedimiento getTipoProcedimiento() {
        return tipoProcedimiento;
    }

    public void setTipoProcedimiento(TipoProcedimiento tipoProcedimiento) {
        this.tipoProcedimiento = tipoProcedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (procedimientosPK != null ? procedimientosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimientos)) {
            return false;
        }
        Procedimientos other = (Procedimientos) object;
        if ((this.procedimientosPK == null && other.procedimientosPK != null) || (this.procedimientosPK != null && !this.procedimientosPK.equals(other.procedimientosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Procedimientos[ procedimientosPK=" + procedimientosPK + " ]";
    }
    
}
