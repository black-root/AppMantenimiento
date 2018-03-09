package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;
import uesocc.tpi.edu.sv.Entities.SubTipomantenimiento;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(Tipomantenimiento.class)
public class Tipomantenimiento_ { 

    public static volatile SingularAttribute<Tipomantenimiento, String> descripcion;
    public static volatile SingularAttribute<Tipomantenimiento, Integer> pkIdtipomantenimiento;
    public static volatile ListAttribute<Tipomantenimiento, Ordentrabajo> ordentrabajoList;
    public static volatile SingularAttribute<Tipomantenimiento, SubTipomantenimiento> fkIdsubTipomantenimiento;

}