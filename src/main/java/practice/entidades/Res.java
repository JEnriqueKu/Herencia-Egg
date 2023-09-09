package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Res extends Roja{
    protected boolean dura;

    public Res(String nombre, boolean dulce, String proteina, boolean sangre, boolean grasasSaturadas, boolean dura) {
        super(nombre, dulce, proteina, sangre, grasasSaturadas);
        this.dura = dura;
    }

}
