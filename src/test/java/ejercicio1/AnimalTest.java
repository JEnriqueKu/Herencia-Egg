package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testAlimentarse() {
        Animal animal1 = new Animal("Stich","Comida",5,"No aplica");
        String respuesta = animal1.alimentarse();
        assertEquals("Stich el No aplica se alimenta de Comida",respuesta);


        Animal animal2 = new Animal("Stich","Comida",5,"No aplica");
        String respuesta2 = animal2.alimentarse();
        assertNotEquals("Stich el No aplica se alimenta de Comid",respuesta);
    }
}