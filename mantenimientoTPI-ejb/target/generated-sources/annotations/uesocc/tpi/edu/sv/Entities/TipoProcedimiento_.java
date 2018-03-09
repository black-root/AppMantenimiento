package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(TipoProcedimiento.class)
public class TipoProcedimiento_ { 

    public static volatile SingularAttribute<TipoProcedimiento, String> descripcion;
    public static volatile SingularAttribute<TipoProcedimiento, Integer> pkIdtipoProcedimiento;
    public static volatile SingularAttribute<TipoProcedimiento, String> observacion;
    public static volatile ListAttribute<TipoProcedimiento, Procedimientos> procedimientosList;

}