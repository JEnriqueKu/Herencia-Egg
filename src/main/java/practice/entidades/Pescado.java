package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pescado extends Blanca{
    protected boolean omega3;

    public Pescado(String nombre, boolean dulce, String proteina, boolean grasasSaturadas, boolean marino, boolean omega3) {
        super(nombre, dulce, proteina, grasasSaturadas, marino);
        this.omega3 = omega3;
    }
}
