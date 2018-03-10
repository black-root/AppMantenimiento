package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.DianosticoParte;
import uesocc.tpi.edu.sv.Entities.Equipo;
import uesocc.tpi.edu.sv.Entities.Fabricantes;
import uesocc.tpi.edu.sv.Entities.MantenimientoDetalle;
import uesocc.tpi.edu.sv.Entities.Ordentrabajo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-10T01:35:19")
@StaticMetamodel(Equipo.class)
public class Equipo_ { 

    public static volatile ListAttribute<Equipo, DianosticoParte> dianosticoParteList;
    public static volatile SingularAttribute<Equipo, Boolean> arquitectura3264;
    public static volatile ListAttribute<Equipo, Ordentrabajo> ordentrabajoList;
    public static volatile SingularAttribute<Equipo, Boolean> hardwareSoftware;
    public static volatile SingularAttribute<Equipo, String> sofware;
    public static volatile SingularAttribute<Equipo, String> modelo;
    public static volatile SingularAttribute<Equipo, String> version;
    public static volatile SingularAttribute<Equipo, String> pkIdnoserie;
    public static volatile SingularAttribute<Equipo, Boolean> licencia;
    public static volatile SingularAttribute<Equipo, String> observaciones;
    public static volatile ListAttribute<Equipo, MantenimientoDetalle> mantenimientoDetalleList;
    public static volatile ListAttribute<Equipo, Equipo> equipoList;
    public static volatile SingularAttribute<Equipo, String> noinventario;
    public static volatile SingularAttribute<Equipo, Fabricantes> fkIdfabricante;
    public static volatile SingularAttribute<Equipo, String> partnumber;
    public static volatile SingularAttribute<Equipo, Equipo> fkPadreidnoserie;

}