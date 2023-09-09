package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roja extends Carne{
    protected boolean sangre;
    protected boolean grasasSaturadas;

    public Roja(String nombre, boolean dulce, String proteina, boolean sangre, boolean grasasSaturadas) {
        super(nombre, dulce, proteina);
        this.sangre = sangre;
        this.grasasSaturadas = grasasSaturadas;
    }
}
