package ejercicio3.Figuras;

import ejercicio3.Interfaces.Calculos;

public class Rectangulo implements Calculos {
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {

        return largo* ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(largo+ancho);
    }

    @Override
    public String toString() {
        return "El rectangulo con dimenciones " +
                "largo=" + largo +
                ", ancho=" + ancho ;
    }
}
