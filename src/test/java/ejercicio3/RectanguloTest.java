package ejercicio3;


import ejercicio3.Figuras.Rectangulo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanguloTest {
    Rectangulo rec =  new Rectangulo();


    @Test
    public void calcularArea() {
        rec.setAncho(4);
        rec.setLargo(10);
        assertEquals(41, rec.calcularArea(),1 );

        rec.setAncho(3);
        rec.setLargo(5);
        assertEquals(15, rec.calcularArea(),0 );

    }

    @Test
    public void calcularPerimetro() {

        rec.setAncho(4);
        rec.setLargo(10);
        assertEquals(28, rec.calcularPerimetro(),0 );

        rec.setAncho(3);
        rec.setLargo(5);
        assertEquals(16, rec.calcularPerimetro(),0 );
    }
}