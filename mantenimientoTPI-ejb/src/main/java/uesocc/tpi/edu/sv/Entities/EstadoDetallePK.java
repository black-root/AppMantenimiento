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
public class EstadoDetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idestado")
    private int pkIdestado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idpersonal")
    private int pkIdpersonal;
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

    public EstadoDetallePK() {
    }

    public EstadoDetallePK(int pkIdestado, int pkIdpersonal, int pkIddianosticoParte, int pkIdpaso, int pkIdtipoProcedimiento) {
        this.pkIdestado = pkIdestado;
        this.pkIdpersonal = pkIdpersonal;
        this.pkIddianosticoParte = pkIddianosticoParte;
        this.pkIdpaso = pkIdpaso;
        this.pkIdtipoProcedimiento = pkIdtipoProcedimiento;
    }

    public int getPkIdestado() {
        return pkIdestado;
    }

    public void setPkIdestado(int pkIdestado) {
        this.pkIdestado = pkIdestado;
    }

    public int getPkIdpersonal() {
        return pkIdpersonal;
    }

    public void setPkIdpersonal(int pkIdpersonal) {
        this.pkIdpersonal = pkIdpersonal;
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
        hash += (int) pkIdestado;
        hash += (int) pkIdpersonal;
        hash += (int) pkIddianosticoParte;
        hash += (int) pkIdpaso;
        hash += (int) pkIdtipoProcedimiento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoDetallePK)) {
            return false;
        }
        EstadoDetallePK other = (EstadoDetallePK) object;
        if (this.pkIdestado != other.pkIdestado) {
            return false;
        }
        if (this.pkIdpersonal != other.pkIdpersonal) {
            return false;
        }
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
        return "uesocc.tpi.edu.sv.Entities.EstadoDetallePK[ pkIdestado=" + pkIdestado + ", pkIdpersonal=" + pkIdpersonal + ", pkIddianosticoParte=" + pkIddianosticoParte + ", pkIdpaso=" + pkIdpaso + ", pkIdtipoProcedimiento=" + pkIdtipoProcedimiento + " ]";
    }
    
}
