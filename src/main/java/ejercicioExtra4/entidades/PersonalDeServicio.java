package ejercicioExtra4.entidades;

import ejercicioExtra4.enums.Seccion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class PersonalDeServicio extends Empleado{
    private Seccion seccion;

    public PersonalDeServicio(int anioIncorporacion, int numeroDespacho, Seccion seccion) {
        super(anioIncorporacion, numeroDespacho);
        this.seccion = seccion;
    }

    public void trasladoDeSeccion(Seccion seccion){
        this.seccion = seccion;
    }
}
