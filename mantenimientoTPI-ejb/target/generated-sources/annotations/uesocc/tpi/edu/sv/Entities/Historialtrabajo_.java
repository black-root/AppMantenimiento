package uesocc.tpi.edu.sv.Entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Personal;
import uesocc.tpi.edu.sv.Entities.Rol;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Historialtrabajo.class)
public class Historialtrabajo_ { 

    public static volatile SingularAttribute<Historialtrabajo, Date> fechainicio;
    public static volatile SingularAttribute<Historialtrabajo, Personal> fkIdpersonal;
    public static volatile SingularAttribute<Historialtrabajo, Date> fechafin;
    public static volatile SingularAttribute<Historialtrabajo, Integer> pkIdhistorialtrabajo;
    public static volatile SingularAttribute<Historialtrabajo, Rol> fkIdtrabajo;

}