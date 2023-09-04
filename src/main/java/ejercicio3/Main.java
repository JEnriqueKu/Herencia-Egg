package ejercicio3;

import ejercicio3.Figuras.Circulo;
import ejercicio3.Figuras.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo cir = new Circulo(5);
        Rectangulo rec = new Rectangulo(10, 5);

        System.out.println( cir +  " tiene un área de " +
                Math.round(cir.calcularArea()) + " y un perimetro de " + Math.round(cir.calcularPerimetro()));

        System.out.println( rec +  " tiene un área de " +
                rec.calcularArea() + " y un perimetro de " + rec.calcularPerimetro());
    }
}
