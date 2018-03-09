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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yisus
 */
@Entity
@Table(name = "diagnostico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diagnostico.findAll", query = "SELECT d FROM Diagnostico d")
    , @NamedQuery(name = "Diagnostico.findByPkIddiagnostico", query = "SELECT d FROM Diagnostico d WHERE d.pkIddiagnostico = :pkIddiagnostico")})
public class Diagnostico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_iddiagnostico")
    private Integer pkIddiagnostico;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fkIddiagnostico", fetch = FetchType.LAZY)
    private List<DianosticoParte> dianosticoParteList;
    @JoinColumn(name = "fk_idordentrabajo", referencedColumnName = "pk_idordentrabajo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordentrabajo fkIdordentrabajo;

    public Diagnostico() {
    }

    public Diagnostico(Integer pkIddiagnostico) {
        this.pkIddiagnostico = pkIddiagnostico;
    }

    public Integer getPkIddiagnostico() {
        return pkIddiagnostico;
    }

    public void setPkIddiagnostico(Integer pkIddiagnostico) {
        this.pkIddiagnostico = pkIddiagnostico;
    }

    @XmlTransient
    public List<DianosticoParte> getDianosticoParteList() {
        return dianosticoParteList;
    }

    public void setDianosticoParteList(List<DianosticoParte> dianosticoParteList) {
        this.dianosticoParteList = dianosticoParteList;
    }

    public Ordentrabajo getFkIdordentrabajo() {
        return fkIdordentrabajo;
    }

    public void setFkIdordentrabajo(Ordentrabajo fkIdordentrabajo) {
        this.fkIdordentrabajo = fkIdordentrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIddiagnostico != null ? pkIddiagnostico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnostico)) {
            return false;
        }
        Diagnostico other = (Diagnostico) object;
        if ((this.pkIddiagnostico == null && other.pkIddiagnostico != null) || (this.pkIddiagnostico != null && !this.pkIddiagnostico.equals(other.pkIddiagnostico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.Diagnostico[ pkIddiagnostico=" + pkIddiagnostico + " ]";
    }
    
}
