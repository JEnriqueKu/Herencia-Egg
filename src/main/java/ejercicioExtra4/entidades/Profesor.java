package ejercicioExtra4.entidades;

import ejercicioExtra4.enums.Departamento;
import ejercicioExtra4.enums.EstadoCivil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Profesor extends Empleado{
    private Departamento departamento;

    public Profesor(String nombre, String apellidos, int numIdentificacion, EstadoCivil estadoCivil, int anioIncorporacion, int numeroDespacho, Departamento departamento) {
        super(nombre, apellidos, numIdentificacion, estadoCivil, anioIncorporacion, numeroDespacho);
        this.departamento = departamento;
    }

    public void cambioDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "departamento=" + departamento +
                ", anioIncorporacion=" + anioIncorporacion +
                ", numeroDespacho=" + numeroDespacho +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numIdentificacion=" + numIdentificacion +
                ", estadoCivil=" + estadoCivil +
                '}';
    }
}
