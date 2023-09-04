package ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {
    private String nombre;
    private String alimento;
    private int edad;
    private String raza;

    public String alimentarse(){
        String respuesta;

        System.out.println(nombre + " el " + raza + " se alimenta de "+ alimento);
        return respuesta = nombre + " el " + raza + " se alimenta de "+ alimento;
    }

}
