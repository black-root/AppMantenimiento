package uesocc.tpi.edu.sv.Entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uesocc.tpi.edu.sv.Entities.Equipo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-09T00:40:04")
@StaticMetamodel(Fabricantes.class)
public class Fabricantes_ { 

    public static volatile SingularAttribute<Fabricantes, String> descripcion;
    public static volatile SingularAttribute<Fabricantes, String> correo;
    public static volatile SingularAttribute<Fabricantes, String> direccion;
    public static volatile ListAttribute<Fabricantes, Equipo> equipoList;
    public static volatile SingularAttribute<Fabricantes, Integer> pkIdfabricante;
    public static volatile SingularAttribute<Fabricantes, String> telefono;
    public static volatile SingularAttribute<Fabricantes, String> nombre;

}