package uesocc.tpi.edu.sv.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Diagnostico;
import uesocc.tpi.edu.sv.Entities.DianosticoParte;
import uesocc.tpi.edu.sv.Entities.Equipo;
import uesocc.tpi.edu.sv.Entities.MantenimientoDetalle;
import uesocc.tpi.edu.sv.Entities.Prioridad;
import uesocc.tpi.edu.sv.Entities.Solicitud;
import uesocc.tpi.edu.sv.Entities.Tipomantenimiento;
import uesocc.tpi.edu.sv.Entities.Unidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Ordentrabajo.class)
public class Ordentrabajo_ { 

    public static volatile ListAttribute<Ordentrabajo, DianosticoParte> dianosticoParteList;
    public static volatile SingularAttribute<Ordentrabajo, Date> solicitudfecha;
    public static volatile SingularAttribute<Ordentrabajo, Boolean> estado;
    public static volatile SingularAttribute<Ordentrabajo, String> clientedomicilio;
    public static volatile SingularAttribute<Ordentrabajo, Date> ordentrabajoaprobadafecha;
    public static volatile SingularAttribute<Ordentrabajo, Prioridad> fkIdprioridad;
    public static volatile ListAttribute<Ordentrabajo, Diagnostico> diagnosticoList;
    public static volatile SingularAttribute<Ordentrabajo, String> clientenombre;
    public static volatile SingularAttribute<Ordentrabajo, String> solicituddescripcion;
    public static volatile SingularAttribute<Ordentrabajo, Integer> pkIdordentrabajo;
    public static volatile SingularAttribute<Ordentrabajo, String> tecnicodiagnostico;
    public static volatile ListAttribute<Ordentrabajo, MantenimientoDetalle> mantenimientoDetalleList;
    public static volatile SingularAttribute<Ordentrabajo, Tipomantenimiento> fkIdtipomantenimiento;
    public static volatile SingularAttribute<Ordentrabajo, Date> posiblefechaentrega;
    public static volatile SingularAttribute<Ordentrabajo, Solicitud> fkIdorigensolicitud;
    public static volatile SingularAttribute<Ordentrabajo, String> clientetelefono;
    public static volatile SingularAttribute<Ordentrabajo, Equipo> fkIdnoserie;
    public static volatile SingularAttribute<Ordentrabajo, String> clienteemail;
    public static volatile SingularAttribute<Ordentrabajo, Unidad> fkIdunidad;

}