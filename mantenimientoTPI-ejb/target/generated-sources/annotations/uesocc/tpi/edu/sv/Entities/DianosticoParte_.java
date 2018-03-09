package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Diagnostico;
import uesocc.tpi.edu.sv.Entities.Equipo;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;
import uesocc.tpi.edu.sv.Entities.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(DianosticoParte.class)
public class DianosticoParte_ { 

    public static volatile SingularAttribute<DianosticoParte, String> descripcionproblema;
    public static volatile SingularAttribute<DianosticoParte, Integer> pkIddianosticoParte;
    public static volatile SingularAttribute<DianosticoParte, Diagnostico> fkIddiagnostico;
    public static volatile SingularAttribute<DianosticoParte, Equipo> fkIdnoserie;
    public static volatile SingularAttribute<DianosticoParte, Ordentrabajo> fkIdordentrabajo;
    public static volatile ListAttribute<DianosticoParte, Procedimientos> procedimientosList;

}