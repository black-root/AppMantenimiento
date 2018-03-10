package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Pasos.class)
public class Pasos_ { 

    public static volatile SingularAttribute<Pasos, String> descripcion;
    public static volatile SingularAttribute<Pasos, Integer> pkIdpaso;
    public static volatile SingularAttribute<Pasos, String> observacion;
    public static volatile ListAttribute<Pasos, Procedimientos> procedimientosList;
    public static volatile SingularAttribute<Pasos, String> duracionPaso;

}