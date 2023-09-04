package ejercicio2.servicios;

import ejercicio2.entidades.Lavadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LavadoraServiceTest {

    LavadoraService lavadoraService = new LavadoraService();
    @Test
    void crearLavadora() {
        Lavadora lavadora = lavadoraService.crearLavadora();

        assertNotNull(lavadora);
    }

    @Test
    void precioFinal() {
        Lavadora lavadora = new Lavadora(500,"Blanca",'a',25,15);
        lavadoraService.precioFinal(lavadora);

        assertEquals(2000,lavadora.getPrecio());

        lavadora.setPrecio(500);
        lavadora.setCarga(40);
        lavadoraService.precioFinal(lavadora);
        assertEquals(2500,lavadora.getPrecio());

    }
}