package ejercicioExtra1.servicios;

import ejercicioExtra1.entidades.Barco;
import ejercicioExtra1.entidades.Velero;

import java.util.Scanner;

public class VeleroService extends BarcoService{
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    @Override
    public Velero crearBarco() {
        System.out.println("Ingrese el numero de mastiles");
        int numMastiles = scanner.nextInt();

        Velero velero = new Velero();
        Barco barco = super.crearBarco();

        velero.setEslora(barco.getEslora());
        velero.setAnioFabricacion(barco.getAnioFabricacion());
        velero.setMatricula(barco.getMatricula());
        velero.setNumMastiles(numMastiles);

        return velero;
    }

    @Override
    public double calcularModulo(Barco barco) {
        return super.calcularModulo(((Velero) barco))+ ((Velero) barco).getNumMastiles();
    }
}
