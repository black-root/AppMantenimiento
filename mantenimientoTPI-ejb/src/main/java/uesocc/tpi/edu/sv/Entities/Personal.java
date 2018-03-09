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
@Table(name = "personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
    , @NamedQuery(name = "Personal.findByPkIdpersonal", query = "SELECT p FROM Personal p WHERE p.pkIdpersonal = :pkIdpersonal")
    , @NamedQuery(name = "Personal.findByFkPadrepersonal", query = "SELECT p FROM Personal p WHERE p.fkPadrepersonal = :fkPadrepersonal")
    , @NamedQuery(name = "Personal.findByNombre", query = "SELECT p FROM Personal p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Personal.findByApellido", query = "SELECT p FROM Personal p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "Personal.findByDui", query = "SELECT p FROM Personal p WHERE p.dui = :dui")
    , @NamedQuery(name = "Personal.findByNit", query = "SELECT p FROM Personal p WHERE p.nit = :nit")
    , @NamedQuery(name = "Personal.findByEstado", query = "SELECT p FROM Personal p WHERE p.estado = :estado")
    , @NamedQuery(name = "Personal.findByEmpleadoestudiante", query = "SELECT p FROM Personal p WHERE p.empleadoestudiante = :empleadoestudiante")
    , @NamedQuery(name = "Personal.findByDue", query = "SELECT p FROM Personal p WHERE p.due = :due")
    , @NamedQuery(name = "Personal.findByDomicilio", query = "SELECT p FROM Personal p WHERE p.domicilio = :domicilio")})
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idpersonal")
    private Integer pkIdpersonal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_padrepersonal")
    private int fkPadrepersonal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "dui")
    private String dui;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nit")
    private String nit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "empleadoestudiante")
    private boolean empleadoestudiante;
    @Size(max = 45)
    @Column(name = "due")
    private String due;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "domicilio")
    private String domicilio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdpersonal", fetch = FetchType.LAZY)
    private List<Historialtrabajo> historialtrabajoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personal", fetch = FetchType.LAZY)
    private List<EstadoDetalle> estadoDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdpersonal", fetch = FetchType.LAZY)
    private List<Telefono> telefonoList;

    public Personal() {
    }

    public Personal(Integer pkIdpersonal) {
        this.pkIdpersonal = pkIdpersonal;
    }

    public Personal(Integer pkIdpersonal, int fkPadrepersonal, String nombre, String apellido, String dui, String nit, boolean estado, boolean empleadoestudiante, String domicilio) {
        this.pkIdpersonal = pkIdpersonal;
        this.fkPadrepersonal = fkPadrepersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.nit = nit;
        this.estado = estado;
        this.empleadoestudiante = empleadoestudiante;
        this.domicilio = domicilio;
    }

    public Integer getPkIdpersonal() {
        return pkIdpersonal;
    }

    public void setPkIdpersonal(Integer pkIdpersonal) {
        this.pkIdpersonal = pkIdpersonal;
    }

    public int getFkPadrepersonal() {
        return fkPadrepersonal;
    }

    public void setFkPadrepersonal(int fkPadrepersonal) {
        this.fkPadrepersonal = fkPadrepersonal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEmpleadoestudiante() {
        return empleadoestudiante;
    }

    public void setEmpleadoestudiante(boolean empleadoestudiante) {
        this.empleadoestudiante = empleadoestudiante;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @XmlTransient
    public List<Historialtrabajo> getHistorialtrabajoList() {
        return historialtrabajoList;
    }

    public void setHistorialtrabajoList(List<Historialtrabajo> historialtrabajoList) {
        this.historialtrabajoList = historialtrabajoList;
    }

    @XmlTransient
    public List<EstadoDetalle> getEstadoDetalleList() {
        return estadoDetalleList;
    }

    public void setEstadoDetalleList(List<EstadoDetalle> estadoDetalleList) {
        this.estadoDetalleList = estadoDetalleList;
    }

    @XmlTransient
    public List<Telefono> getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(List<Telefono> telefonoList) {
        this.telefonoList = telefonoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdpersonal != null ? pkIdpersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.pkIdpersonal == null && other.pkIdpersonal != null) || (this.pkIdpersonal != null && !this.pkIdpersonal.equals(other.pkIdpersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Personal[ pkIdpersonal=" + pkIdpersonal + " ]";
    }
    
}
