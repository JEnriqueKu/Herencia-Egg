package ejercicio3.Figuras;

import ejercicio3.Interfaces.Calculos;

public class Circulo implements Calculos {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI* Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro() {
        return PI*2*radio;
    }

    @Override
    public String toString() {
        return "El circulo de radio: " + radio ;
    }
}
