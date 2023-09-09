package ejercicioExtra2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Edificio {
    protected int ancho;
    protected int alto;
    protected  int largo;

    public double calcularSuperficie(){
        return largo*ancho;
    }

    public double calcularVolumen(){
        return alto*calcularSuperficie();
    }
}
