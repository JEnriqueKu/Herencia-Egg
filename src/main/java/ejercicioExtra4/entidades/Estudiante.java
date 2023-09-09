package ejercicioExtra4.entidades;

import ejercicioExtra4.enums.Departamento;
import ejercicioExtra4.enums.EstadoCivil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Estudiante extends Persona{
    private ArrayList<Departamento> cursos = new ArrayList<>();

    public Estudiante(String nombre, String apellidos, int numIdentificacion, EstadoCivil estadoCivil, ArrayList<Departamento> cursos) {
        super(nombre, apellidos, numIdentificacion, estadoCivil);
        this.cursos = cursos;
    }

    public void matricularEstudiante(Departamento departamento){
        if (!cursos.contains(departamento)) cursos.add(departamento);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "cursos=" + cursos +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
