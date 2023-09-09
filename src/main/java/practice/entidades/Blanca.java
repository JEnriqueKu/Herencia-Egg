package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Blanca extends Carne{
    protected boolean grasasSaturadas;
    protected boolean marino;

    public Blanca(String nombre, boolean dulce, String proteina, boolean grasasSaturadas, boolean marino) {
        super(nombre, dulce, proteina);
        this.grasasSaturadas = grasasSaturadas;
        this.marino = marino;
    }
}
