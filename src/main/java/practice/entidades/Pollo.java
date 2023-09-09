package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pollo extends Blanca{
    protected boolean pechuga;

    public Pollo(String nombre, boolean dulce, String proteina, boolean grasasSaturadas, boolean marino, boolean pechuga) {
        super(nombre, dulce, proteina, grasasSaturadas, marino);
        this.pechuga = pechuga;
    }
}
