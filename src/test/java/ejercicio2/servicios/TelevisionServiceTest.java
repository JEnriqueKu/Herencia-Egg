package ejercicio2.servicios;

import ejercicio2.entidades.Televisor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionServiceTest {

    TelevisionService televisionService = new TelevisionService();
    @Test
    void crearTelevisor() {
        Televisor televisor = new Televisor(500,"Blanco",'a',15,30,false);

        assertNotNull(televisor);
    }

    @Test
    void precioFinal() {
        Televisor televisor = new Televisor(500,"Blanco",'a',15,30,false);
        televisionService.precioFinal(televisor);

        assertEquals(1600,televisor.getPrecio(),0);

        televisor.setPrecio(500);
        televisor.setResolucion(45);
        televisionService.precioFinal(televisor);
        assertEquals(2080,televisor.getPrecio(),0);

        televisor.setPrecio(500);
        televisor.setResolucion(30);
        televisor.setSintonizadorTDT(true);
        televisionService.precioFinal(televisor);
        assertEquals(2100,televisor.getPrecio(),0);
    }
}