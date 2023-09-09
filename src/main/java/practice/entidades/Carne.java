package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carne extends Alimento{
    protected String proteina;

    public Carne(String nombre, boolean dulce, String proteina) {
        super(nombre, dulce);
        this.proteina = proteina;
    }
}
