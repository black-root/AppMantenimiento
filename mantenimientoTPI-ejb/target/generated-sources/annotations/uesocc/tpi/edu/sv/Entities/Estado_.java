package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, Integer> pkIdestado;
    public static volatile SingularAttribute<Estado, String> estadonombre;
    public static volatile ListAttribute<Estado, EstadoDetalle> estadoDetalleList;

}