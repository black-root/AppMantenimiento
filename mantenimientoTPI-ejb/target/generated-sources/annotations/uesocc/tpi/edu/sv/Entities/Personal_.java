package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.EstadoDetalle;
import uesocc.tpi.edu.sv.Entities.Historialtrabajo;
import uesocc.tpi.edu.sv.Entities.Telefono;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, Boolean> estado;
    public static volatile ListAttribute<Personal, Telefono> telefonoList;
    public static volatile ListAttribute<Personal, Historialtrabajo> historialtrabajoList;
    public static volatile ListAttribute<Personal, EstadoDetalle> estadoDetalleList;
    public static volatile SingularAttribute<Personal, String> nombre;
    public static volatile SingularAttribute<Personal, Integer> pkIdpersonal;
    public static volatile SingularAttribute<Personal, String> domicilio;
    public static volatile SingularAttribute<Personal, Integer> fkPadrepersonal;
    public static volatile SingularAttribute<Personal, String> due;
    public static volatile SingularAttribute<Personal, String> apellido;
    public static volatile SingularAttribute<Personal, Boolean> empleadoestudiante;
    public static volatile SingularAttribute<Personal, String> nit;
    public static volatile SingularAttribute<Personal, String> dui;

}