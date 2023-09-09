package practice.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruta extends Alimento{
    protected boolean semilla;

    public Fruta(String nombre, boolean dulce, boolean semilla) {
        super(nombre, dulce);
        this.semilla = semilla;
    }
}
