package ejercicioExtra1.servicios;

import ejercicioExtra1.entidades.AMotor;
import ejercicioExtra1.entidades.Barco;
import ejercicioExtra1.entidades.Velero;

import java.util.Scanner;

public class AMotorService extends BarcoService{
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    @Override
    public AMotor crearBarco() {
        System.out.println("Ingrese la potencia CV");
        int potenciaCV = scanner.nextInt();

        Barco barco = super.crearBarco();
        AMotor barcoAMotor = new AMotor();

        barcoAMotor.setEslora(barco.getEslora());
        barcoAMotor.setAnioFabricacion(barco.getAnioFabricacion());
        barcoAMotor.setMatricula(barco.getMatricula());
        barcoAMotor.setPotenciaCV(potenciaCV);

        return barcoAMotor;
    }

    @Override
    public double calcularModulo(Barco barco) {
        return super.calcularModulo(((AMotor) barco))+ ((AMotor) barco).getPotenciaCV();
    }
}
