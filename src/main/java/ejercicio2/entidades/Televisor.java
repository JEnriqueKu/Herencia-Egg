package ejercicio2.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Televisor extends Electrodomestico{
    protected double resolucion;
    protected boolean sintonizadorTDT;

    public Televisor(double precio, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
