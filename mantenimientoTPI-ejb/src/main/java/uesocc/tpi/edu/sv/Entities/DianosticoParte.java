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
@Table(name = "dianostico_parte")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DianosticoParte.findAll", query = "SELECT d FROM DianosticoParte d")
    , @NamedQuery(name = "DianosticoParte.findByPkIddianosticoParte", query = "SELECT d FROM DianosticoParte d WHERE d.pkIddianosticoParte = :pkIddianosticoParte")
    , @NamedQuery(name = "DianosticoParte.findByDescripcionproblema", query = "SELECT d FROM DianosticoParte d WHERE d.descripcionproblema = :descripcionproblema")})
public class DianosticoParte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_iddianostico_parte")
    private Integer pkIddianosticoParte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcionproblema")
    private String descripcionproblema;
    @JoinColumn(name = "fk_iddiagnostico", referencedColumnName = "pk_iddiagnostico")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Diagnostico fkIddiagnostico;
    @JoinColumn(name = "fk_idnoserie", referencedColumnName = "pk_idnoserie")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo fkIdnoserie;
    @JoinColumn(name = "fk_idordentrabajo", referencedColumnName = "pk_idordentrabajo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordentrabajo fkIdordentrabajo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dianosticoParte", fetch = FetchType.LAZY)
    private List<Procedimientos> procedimientosList;

    public DianosticoParte() {
    }

    public DianosticoParte(Integer pkIddianosticoParte) {
        this.pkIddianosticoParte = pkIddianosticoParte;
    }

    public DianosticoParte(Integer pkIddianosticoParte, String descripcionproblema) {
        this.pkIddianosticoParte = pkIddianosticoParte;
        this.descripcionproblema = descripcionproblema;
    }

    public Integer getPkIddianosticoParte() {
        return pkIddianosticoParte;
    }

    public void setPkIddianosticoParte(Integer pkIddianosticoParte) {
        this.pkIddianosticoParte = pkIddianosticoParte;
    }

    public String getDescripcionproblema() {
        return descripcionproblema;
    }

    public void setDescripcionproblema(String descripcionproblema) {
        this.descripcionproblema = descripcionproblema;
    }

    public Diagnostico getFkIddiagnostico() {
        return fkIddiagnostico;
    }

    public void setFkIddiagnostico(Diagnostico fkIddiagnostico) {
        this.fkIddiagnostico = fkIddiagnostico;
    }

    public Equipo getFkIdnoserie() {
        return fkIdnoserie;
    }

    public void setFkIdnoserie(Equipo fkIdnoserie) {
        this.fkIdnoserie = fkIdnoserie;
    }

    public Ordentrabajo getFkIdordentrabajo() {
        return fkIdordentrabajo;
    }

    public void setFkIdordentrabajo(Ordentrabajo fkIdordentrabajo) {
        this.fkIdordentrabajo = fkIdordentrabajo;
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
        hash += (pkIddianosticoParte != null ? pkIddianosticoParte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DianosticoParte)) {
            return false;
        }
        DianosticoParte other = (DianosticoParte) object;
        if ((this.pkIddianosticoParte == null && other.pkIddianosticoParte != null) || (this.pkIddianosticoParte != null && !this.pkIddianosticoParte.equals(other.pkIddianosticoParte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.DianosticoParte[ pkIddianosticoParte=" + pkIddianosticoParte + " ]";
    }
    
}
