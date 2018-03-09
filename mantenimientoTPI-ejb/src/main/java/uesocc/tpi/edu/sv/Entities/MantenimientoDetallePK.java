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
public class MantenimientoDetallePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idmantenimiento_detallecol")
    private int pkIdmantenimientoDetallecol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pk_idordentrabajo")
    private int pkIdordentrabajo;

    public MantenimientoDetallePK() {
    }

    public MantenimientoDetallePK(int pkIdmantenimientoDetallecol, int pkIdordentrabajo) {
        this.pkIdmantenimientoDetallecol = pkIdmantenimientoDetallecol;
        this.pkIdordentrabajo = pkIdordentrabajo;
    }

    public int getPkIdmantenimientoDetallecol() {
        return pkIdmantenimientoDetallecol;
    }

    public void setPkIdmantenimientoDetallecol(int pkIdmantenimientoDetallecol) {
        this.pkIdmantenimientoDetallecol = pkIdmantenimientoDetallecol;
    }

    public int getPkIdordentrabajo() {
        return pkIdordentrabajo;
    }

    public void setPkIdordentrabajo(int pkIdordentrabajo) {
        this.pkIdordentrabajo = pkIdordentrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pkIdmantenimientoDetallecol;
        hash += (int) pkIdordentrabajo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MantenimientoDetallePK)) {
            return false;
        }
        MantenimientoDetallePK other = (MantenimientoDetallePK) object;
        if (this.pkIdmantenimientoDetallecol != other.pkIdmantenimientoDetallecol) {
            return false;
        }
        if (this.pkIdordentrabajo != other.pkIdordentrabajo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uesocc.tpi.edu.sv.Entities.MantenimientoDetallePK[ pkIdmantenimientoDetallecol=" + pkIdmantenimientoDetallecol + ", pkIdordentrabajo=" + pkIdordentrabajo + " ]";
    }
    
}
