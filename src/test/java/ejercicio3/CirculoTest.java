package ejercicio3;

import ejercicio3.Figuras.Circulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CirculoTest  {
    Circulo cir = new Circulo();

    @Test
    public void testCalcularArea() {
        cir.setRadio(5);
        assertEquals(78.54, cir.calcularArea(), 0.1);
        cir.setRadio(10);
        assertEquals(314.16, cir.calcularArea(), 0.1);
    }

    @Test
    public void testCalcularPerimetro() {
        cir.setRadio(5);
        assertEquals(31.416, cir.calcularPerimetro(), 0.1);
        cir.setRadio(10);
        assertEquals(62.832, cir.calcularPerimetro(), 0.1);
    }
}