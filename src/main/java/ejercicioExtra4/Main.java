package ejercicioExtra4;

import ejercicioExtra4.entidades.Empleado;
import ejercicioExtra4.entidades.Estudiante;
import ejercicioExtra4.entidades.Persona;
import ejercicioExtra4.entidades.Profesor;
import ejercicioExtra4.enums.Departamento;
import ejercicioExtra4.enums.EstadoCivil;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Martha","Sosa",12323, EstadoCivil.OTRO,2010,12, Departamento.LENGUAJES);

        ArrayList<Departamento> cursos1 = new ArrayList<>();
        cursos1.add(Departamento.MATEMATICAS);
        Estudiante estudiante = new Estudiante("Enrique","Ku",1414,EstadoCivil.SOLTERO, cursos1);
        Persona persona1 = new Persona("Lilia","Gomez",1234,EstadoCivil.SOLTERO);

        Profesor profesor2 = new Profesor();
        profesor2= ((Profesor) persona1);
        profesor2.setDepartamento(Departamento.LENGUAJES);

        ArrayList<Persona> personas1 = new ArrayList<>();
        personas1.add(profesor);
        personas1.add(estudiante);
        personas1.add(persona1);

        System.out.println(profesor2);


    }


}
