/*package ejercicioExtra4.servicio;

import ejercicioExtra4.entidades.Empleado;
import ejercicioExtra4.entidades.Profesor;
import ejercicioExtra4.enums.Departamento;

public class ProfesorService extends PersonaServicio{
    public void reasignacionDepartamento(Profesor profesor){
        System.out.println("¿Cual de los siguientes despachos desea asignar?");
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println("Despacho #" +(i+1));
            System.out.println(Departamento.values()[i]);
        }

        int eleccion = scanner.nextByte();

        profesor.setDepartamento(Departamento.values()[eleccion-1]);
    }
}


 */