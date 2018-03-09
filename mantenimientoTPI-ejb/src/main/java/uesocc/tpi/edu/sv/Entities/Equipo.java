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
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e")
    , @NamedQuery(name = "Equipo.findByPkIdnoserie", query = "SELECT e FROM Equipo e WHERE e.pkIdnoserie = :pkIdnoserie")
    , @NamedQuery(name = "Equipo.findByNoinventario", query = "SELECT e FROM Equipo e WHERE e.noinventario = :noinventario")
    , @NamedQuery(name = "Equipo.findByPartnumber", query = "SELECT e FROM Equipo e WHERE e.partnumber = :partnumber")
    , @NamedQuery(name = "Equipo.findByModelo", query = "SELECT e FROM Equipo e WHERE e.modelo = :modelo")
    , @NamedQuery(name = "Equipo.findByHardwareSoftware", query = "SELECT e FROM Equipo e WHERE e.hardwareSoftware = :hardwareSoftware")
    , @NamedQuery(name = "Equipo.findBySofware", query = "SELECT e FROM Equipo e WHERE e.sofware = :sofware")
    , @NamedQuery(name = "Equipo.findByVersion", query = "SELECT e FROM Equipo e WHERE e.version = :version")
    , @NamedQuery(name = "Equipo.findByArquitectura3264", query = "SELECT e FROM Equipo e WHERE e.arquitectura3264 = :arquitectura3264")
    , @NamedQuery(name = "Equipo.findByLicencia", query = "SELECT e FROM Equipo e WHERE e.licencia = :licencia")
    , @NamedQuery(name = "Equipo.findByObservaciones", query = "SELECT e FROM Equipo e WHERE e.observaciones = :observaciones")})
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "pk_idnoserie")
    private String pkIdnoserie;
    @Size(max = 30)
    @Column(name = "noinventario")
    private String noinventario;
    @Size(max = 20)
    @Column(name = "partnumber")
    private String partnumber;
    @Size(max = 45)
    @Column(name = "modelo")
    private String modelo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hardware_software")
    private boolean hardwareSoftware;
    @Size(max = 45)
    @Column(name = "sofware")
    private String sofware;
    @Size(max = 20)
    @Column(name = "version")
    private String version;
    @Column(name = "arquitectura3264")
    private Boolean arquitectura3264;
    @Column(name = "licencia")
    private Boolean licencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "observaciones")
    private String observaciones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdnoserie", fetch = FetchType.LAZY)
    private List<MantenimientoDetalle> mantenimientoDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdnoserie", fetch = FetchType.LAZY)
    private List<DianosticoParte> dianosticoParteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdnoserie", fetch = FetchType.LAZY)
    private List<Ordentrabajo> ordentrabajoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkPadreidnoserie", fetch = FetchType.LAZY)
    private List<Equipo> equipoList;
    @JoinColumn(name = "fk_padreidnoserie", referencedColumnName = "pk_idnoserie")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo fkPadreidnoserie;
    @JoinColumn(name = "fk_idfabricante", referencedColumnName = "pk_idfabricante")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Fabricantes fkIdfabricante;

    public Equipo() {
    }

    public Equipo(String pkIdnoserie) {
        this.pkIdnoserie = pkIdnoserie;
    }

    public Equipo(String pkIdnoserie, boolean hardwareSoftware, String observaciones) {
        this.pkIdnoserie = pkIdnoserie;
        this.hardwareSoftware = hardwareSoftware;
        this.observaciones = observaciones;
    }

    public String getPkIdnoserie() {
        return pkIdnoserie;
    }

    public void setPkIdnoserie(String pkIdnoserie) {
        this.pkIdnoserie = pkIdnoserie;
    }

    public String getNoinventario() {
        return noinventario;
    }

    public void setNoinventario(String noinventario) {
        this.noinventario = noinventario;
    }

    public String getPartnumber() {
        return partnumber;
    }

    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getHardwareSoftware() {
        return hardwareSoftware;
    }

    public void setHardwareSoftware(boolean hardwareSoftware) {
        this.hardwareSoftware = hardwareSoftware;
    }

    public String getSofware() {
        return sofware;
    }

    public void setSofware(String sofware) {
        this.sofware = sofware;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Boolean getArquitectura3264() {
        return arquitectura3264;
    }

    public void setArquitectura3264(Boolean arquitectura3264) {
        this.arquitectura3264 = arquitectura3264;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(Boolean licencia) {
        this.licencia = licencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    @XmlTransient
    public List<Ordentrabajo> getOrdentrabajoList() {
        return ordentrabajoList;
    }

    public void setOrdentrabajoList(List<Ordentrabajo> ordentrabajoList) {
        this.ordentrabajoList = ordentrabajoList;
    }

    @XmlTransient
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    public Equipo getFkPadreidnoserie() {
        return fkPadreidnoserie;
    }

    public void setFkPadreidnoserie(Equipo fkPadreidnoserie) {
        this.fkPadreidnoserie = fkPadreidnoserie;
    }

    public Fabricantes getFkIdfabricante() {
        return fkIdfabricante;
    }

    public void setFkIdfabricante(Fabricantes fkIdfabricante) {
        this.fkIdfabricante = fkIdfabricante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdnoserie != null ? pkIdnoserie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.pkIdnoserie == null && other.pkIdnoserie != null) || (this.pkIdnoserie != null && !this.pkIdnoserie.equals(other.pkIdnoserie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Equipo[ pkIdnoserie=" + pkIdnoserie + " ]";
    }
    
}
