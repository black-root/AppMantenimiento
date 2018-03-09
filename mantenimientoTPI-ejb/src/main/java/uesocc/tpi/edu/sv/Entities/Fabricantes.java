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
@Table(name = "fabricantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fabricantes.findAll", query = "SELECT f FROM Fabricantes f")
    , @NamedQuery(name = "Fabricantes.findByPkIdfabricante", query = "SELECT f FROM Fabricantes f WHERE f.pkIdfabricante = :pkIdfabricante")
    , @NamedQuery(name = "Fabricantes.findByNombre", query = "SELECT f FROM Fabricantes f WHERE f.nombre = :nombre")
    , @NamedQuery(name = "Fabricantes.findByDescripcion", query = "SELECT f FROM Fabricantes f WHERE f.descripcion = :descripcion")
    , @NamedQuery(name = "Fabricantes.findByCorreo", query = "SELECT f FROM Fabricantes f WHERE f.correo = :correo")
    , @NamedQuery(name = "Fabricantes.findByTelefono", query = "SELECT f FROM Fabricantes f WHERE f.telefono = :telefono")
    , @NamedQuery(name = "Fabricantes.findByDireccion", query = "SELECT f FROM Fabricantes f WHERE f.direccion = :direccion")})
public class Fabricantes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idfabricante")
    private Integer pkIdfabricante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 100)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @Size(max = 45)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIdfabricante", fetch = FetchType.LAZY)
    private List<Equipo> equipoList;

    public Fabricantes() {
    }

    public Fabricantes(Integer pkIdfabricante) {
        this.pkIdfabricante = pkIdfabricante;
    }

    public Fabricantes(Integer pkIdfabricante, String nombre) {
        this.pkIdfabricante = pkIdfabricante;
        this.nombre = nombre;
    }

    public Integer getPkIdfabricante() {
        return pkIdfabricante;
    }

    public void setPkIdfabricante(Integer pkIdfabricante) {
        this.pkIdfabricante = pkIdfabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @XmlTransient
    public List<Equipo> getEquipoList() {
        return equipoList;
    }

    public void setEquipoList(List<Equipo> equipoList) {
        this.equipoList = equipoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdfabricante != null ? pkIdfabricante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fabricantes)) {
            return false;
        }
        Fabricantes other = (Fabricantes) object;
        if ((this.pkIdfabricante == null && other.pkIdfabricante != null) || (this.pkIdfabricante != null && !this.pkIdfabricante.equals(other.pkIdfabricante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Fabricantes[ pkIdfabricante=" + pkIdfabricante + " ]";
    }
    
}
