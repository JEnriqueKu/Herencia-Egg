package ejercicioExtra4.entidades;

import ejercicioExtra4.enums.EstadoCivil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int numIdentificacion;
    protected EstadoCivil estadoCivil;


    public void cambioEstadoCivil(EstadoCivil estadoCivil){
        this.estadoCivil = estadoCivil;
    }

}
