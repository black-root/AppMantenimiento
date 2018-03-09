package uesocc.tpi.edu.sv.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Equipo;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;
import uesocc.tpi.edu.sv.Entities.MantenimientoDetallePK;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(MantenimientoDetalle.class)
public class MantenimientoDetalle_ { 

    public static volatile SingularAttribute<MantenimientoDetalle, Date> fecha;
    public static volatile SingularAttribute<MantenimientoDetalle, EstadoDetalle> estadoDetalle;
    public static volatile SingularAttribute<MantenimientoDetalle, Ordentrabajo> ordentrabajo;
    public static volatile SingularAttribute<MantenimientoDetalle, MantenimientoDetallePK> mantenimientoDetallePK;
    public static volatile SingularAttribute<MantenimientoDetalle, String> observaciones;
    public static volatile SingularAttribute<MantenimientoDetalle, Equipo> fkIdnoserie;

}