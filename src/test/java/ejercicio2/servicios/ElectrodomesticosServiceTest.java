package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

class ElectrodomesticosServiceTest {

    ElectrodomesticosService electrodomesticosService = new ElectrodomesticosService();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
/************************/
    @Test
    void comprobarConsumoEnergetico() {
        //Given
        char[] chars = new char[6];
        for (int i = 0; i < 6; i++) chars[i] = (char) ('a'+i);

        //When
        for (char aChar : chars) {
            char letraComprobada;
            letraComprobada=electrodomesticosService.comprobarConsumoEnergetico(aChar);

            //then
            Assertions.assertEquals(aChar, letraComprobada);
        }

        //Given
        char[] charsX = new char[6];
        charsX[0]='?';
        charsX[1]='g';
        charsX[2]='o';
        charsX[3]='2';
        charsX[4]='*';
        charsX[5]='=';

        //When
        for (char aChar : charsX) {
            char letraComprobada;
            letraComprobada=electrodomesticosService.comprobarConsumoEnergetico(aChar);

            //then
            Assertions.assertEquals('f', letraComprobada);
        }

    }

    @Test
    void comprobarColor() {
        String[] colores = new String[5];
        colores[0]= "Blanco";
        colores[1]= "Negro";
        colores[2]= "Rojo";
        colores[3]= "Azul";
        colores[4]= "Gris";

        for (String color : colores) {
            String colorEsperado = electrodomesticosService.comprobarColor(color);

            assertEquals(colorEsperado,color);
        }



        String[] colores2 = new String[3];
        colores2[0]= "fre";
        colores2[1]= " ";
        colores2[2]= "Por";

        for (String color : colores2) {
            String colorEsperado = electrodomesticosService.comprobarColor(color);

            assertEquals("Blanco",colorEsperado);
        }

    }

    @Test
    void crearElectrodomestico() {

        Electrodomestico electrodomestico = electrodomesticosService.crearElectrodomestico();

        assertNotNull(electrodomestico);
        assertEquals(1000,electrodomestico.getPrecio(),0);

    }

    @Test
    void precioFinal() {

        for (int i = 0; i < 6; i++) {
            Electrodomestico electrodomestico = new Electrodomestico(500,"Blanco",'a',30);
            electrodomestico.setConsumoEnergetico( (char) ('a'+i) );
            electrodomesticosService.precioFinal(electrodomestico);

            switch (electrodomestico.getConsumoEnergetico()) {
                case 'a' -> assertEquals(2000, electrodomestico.getPrecio(),0);
                case 'b' -> assertEquals(1800, electrodomestico.getPrecio(),0);
                case 'c' -> assertEquals(1600, electrodomestico.getPrecio(),0);
                case 'd' -> assertEquals(1500, electrodomestico.getPrecio(),0);
                case 'e' -> assertEquals(1300, electrodomestico.getPrecio(),0);
                case 'f' -> assertEquals(1100, electrodomestico.getPrecio(),0);
            }
        }

        for (int i = 0; i < 4; i++) {
            Electrodomestico electrodomestico = new Electrodomestico(500,"Blanco",'a',0);

            switch (i) {
                case 0 -> {
                    electrodomestico.setPeso(15);
                    electrodomestico.setPrecio(500);
                    electrodomesticosService.precioFinal(electrodomestico);
                    assertEquals(1600, electrodomestico.getPrecio(), 0);
                }
                case 1 -> {
                    electrodomestico.setPeso(25);
                    electrodomestico.setPrecio(500);
                    electrodomesticosService.precioFinal(electrodomestico);
                    assertEquals(2000, electrodomestico.getPrecio(), 0);
                }
                case 2 -> {
                    electrodomestico.setPeso(70);
                    electrodomestico.setPrecio(500);
                    electrodomesticosService.precioFinal(electrodomestico);
                    assertEquals(2300, electrodomestico.getPrecio(), 0);
                }
                case 3 -> {
                    electrodomestico.setPeso(90);
                    electrodomestico.setPrecio(500);
                    electrodomesticosService.precioFinal(electrodomestico);
                    assertEquals(2500, electrodomestico.getPrecio(), 0);
                }
            }
        }

    }

    @Test
    void calcularSumatorias(){

    }
}