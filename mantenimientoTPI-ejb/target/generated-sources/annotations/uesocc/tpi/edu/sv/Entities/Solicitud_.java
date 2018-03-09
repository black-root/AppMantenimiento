package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile SingularAttribute<Solicitud, String> descripcion;
    public static volatile SingularAttribute<Solicitud, Integer> pkIdsolicitud;
    public static volatile SingularAttribute<Solicitud, String> solicitante;
    public static volatile SingularAttribute<Solicitud, String> correo;
    public static volatile ListAttribute<Solicitud, Ordentrabajo> ordentrabajoList;

}