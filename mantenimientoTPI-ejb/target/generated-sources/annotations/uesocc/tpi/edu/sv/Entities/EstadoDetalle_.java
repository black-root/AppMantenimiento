package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Estado;
import uesocc.tpi.edu.sv.Entities.EstadoDetallePK;
import uesocc.tpi.edu.sv.Entities.MantenimientoDetalle;
import uesocc.tpi.edu.sv.Entities.Personal;
import uesocc.tpi.edu.sv.Entities.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(EstadoDetalle.class)
public class EstadoDetalle_ { 

    public static volatile SingularAttribute<EstadoDetalle, Estado> estado;
    public static volatile ListAttribute<EstadoDetalle, MantenimientoDetalle> mantenimientoDetalleList;
    public static volatile SingularAttribute<EstadoDetalle, Personal> personal;
    public static volatile SingularAttribute<EstadoDetalle, EstadoDetallePK> estadoDetallePK;
    public static volatile SingularAttribute<EstadoDetalle, Procedimientos> procedimientos;

}