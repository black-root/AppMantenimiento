/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.tpi.edu.sv.Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author yisus
 */
@Embeddable
public class ProcedimientosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_iddianostico_parte")
    private int pkIddianosticoParte;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idpaso")
    private int pkIdpaso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idtipo_procedimiento")
    private int pkIdtipoProcedimiento;

    public ProcedimientosPK() {
    }

    public ProcedimientosPK(int pkIddianosticoParte, int pkIdpaso, int pkIdtipoProcedimiento) {
        this.pkIddianosticoParte = pkIddianosticoParte;
        this.pkIdpaso = pkIdpaso;
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
    }

    public int getPkIddianosticoParte() {
        return pkIddianosticoParte;
    }

    public void setPkIddianosticoParte(int pkIddianosticoParte) {
        this.pkIddianosticoParte = pkIddianosticoParte;
    }

    public int getPkIdpaso() {
        return pkIdpaso;
    }

    public void setPkIdpaso(int pkIdpaso) {
        this.pkIdpaso = pkIdpaso;
    }

    public int getPkIdtipoProcedimiento() {
        return pkIdtipoProcedimiento;
    }

    public void setPkIdtipoProcedimiento(int pkIdtipoProcedimiento) {
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pkIddianosticoParte;
        hash += (int) pkIdpaso;
        hash += (int) pkIdtipoProcedimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimientosPK)) {
            return false;
        }
        ProcedimientosPK other = (ProcedimientosPK) object;
        if (this.pkIddianosticoParte != other.pkIddianosticoParte) {
            return false;
        }
        if (this.pkIdpaso != other.pkIdpaso) {
            return false;
        }
        if (this.pkIdtipoProcedimiento != other.pkIdtipoProcedimiento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.ProcedimientosPK[ pkIddianosticoParte=" + pkIddianosticoParte + ", pkIdpaso=" + pkIdpaso + ", pkIdtipoProcedimiento=" + pkIdtipoProcedimiento + " ]";
    }
    
}
