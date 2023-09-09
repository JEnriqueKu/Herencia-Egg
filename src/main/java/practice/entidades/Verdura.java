package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Verdura extends Alimento{
    protected boolean hoja;
    protected boolean tallo;

    public Verdura(String nombre, boolean dulce, boolean hoja, boolean tallo) {
        super(nombre, dulce);
        this.hoja = hoja;
        this.tallo = tallo;
    }
}
