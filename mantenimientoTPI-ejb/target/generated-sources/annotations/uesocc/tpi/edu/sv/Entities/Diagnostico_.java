package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.DianosticoParte;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(Diagnostico.class)
public class Diagnostico_ { 

    public static volatile ListAttribute<Diagnostico, DianosticoParte> dianosticoParteList;
    public static volatile SingularAttribute<Diagnostico, Integer> pkIddiagnostico;
    public static volatile SingularAttribute<Diagnostico, Ordentrabajo> fkIdordentrabajo;

}