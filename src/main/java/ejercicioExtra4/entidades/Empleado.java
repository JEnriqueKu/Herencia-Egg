package ejercicioExtra4.entidades;

import ejercicioExtra4.enums.Departamento;
import ejercicioExtra4.enums.EstadoCivil;
import ejercicioExtra4.enums.Seccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empleado extends Persona{
    protected int anioIncorporacion;
    protected int numeroDespacho;

    public Empleado(String nombre, String apellidos, int numIdentificacion, EstadoCivil estadoCivil, int anioIncorporacion, int numeroDespacho) {
        super(nombre, apellidos, numIdentificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignacionDespacho(int numeroDespacho){
        this.numeroDespacho = numeroDespacho;
    }
}
