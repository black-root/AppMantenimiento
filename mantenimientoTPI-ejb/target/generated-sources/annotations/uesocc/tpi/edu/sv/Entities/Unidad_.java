package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Unidad.class)
public class Unidad_ { 

    public static volatile SingularAttribute<Unidad, String> descripcion;
    public static volatile SingularAttribute<Unidad, String> unidadnombre;
    public static volatile ListAttribute<Unidad, Ordentrabajo> ordentrabajoList;
    public static volatile SingularAttribute<Unidad, Integer> pkIdunidad;

}