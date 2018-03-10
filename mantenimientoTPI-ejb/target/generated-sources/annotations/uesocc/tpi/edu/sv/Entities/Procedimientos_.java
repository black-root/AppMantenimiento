package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.DianosticoParte;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;
import uesocc.tpi.edu.sv.Entities.Pasos;
import uesocc.tpi.edu.sv.Entities.ProcedimientosPK;
import uesocc.tpi.edu.sv.Entities.TipoProcedimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Procedimientos.class)
public class Procedimientos_ { 

    public static volatile SingularAttribute<Procedimientos, String> nombreProcedimiento;
    public static volatile ListAttribute<Procedimientos, EstadoDetalle> estadoDetalleList;
    public static volatile SingularAttribute<Procedimientos, ProcedimientosPK> procedimientosPK;
    public static volatile SingularAttribute<Procedimientos, Pasos> pasos;
    public static volatile SingularAttribute<Procedimientos, TipoProcedimiento> tipoProcedimiento;
    public static volatile SingularAttribute<Procedimientos, DianosticoParte> dianosticoParte;

}