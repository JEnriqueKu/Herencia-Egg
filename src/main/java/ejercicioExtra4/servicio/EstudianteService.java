/*package ejercicioExtra4.servicio;

import ejercicioExtra4.entidades.Estudiante;
import ejercicioExtra4.enums.Curso;

public class EstudianteService extends PersonaServicio{
    public void matricularEstudiante(Estudiante estudiante){

        System.out.println("¿Cual de los siguientes cursos desea asignar?");
        for (int i = 0; i < Curso.values().length; i++) {
            System.out.println("Curso #" +(i+1));
            System.out.println(Curso.values()[i]);
        }

        int eleccion = scanner.nextByte();

        estudiante.getCursos().add(Curso.values()[eleccion-1]);
    }
}


 */