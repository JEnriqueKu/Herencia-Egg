package ejercicioExtra1.servicios;

import ejercicioExtra1.entidades.Barco;
import ejercicioExtra1.entidades.YateDeLujo;

import java.util.Scanner;

public class YateDeLujoService extends BarcoService{
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    @Override
    public YateDeLujo crearBarco() {
        System.out.println("Ingrese la potencia CV");
        int potenciaCV = scanner.nextInt();
        System.out.println("Ingrese numero de camarotes");
        int numCamarotes = scanner.nextInt();

        YateDeLujo yateDeLujo = new YateDeLujo();
        Barco barco = super.crearBarco();

        yateDeLujo.setEslora(barco.getEslora());
        yateDeLujo.setAnioFabricacion(barco.getAnioFabricacion());
        yateDeLujo.setMatricula(barco.getMatricula());
        yateDeLujo.setPotenciaCV(potenciaCV);
        yateDeLujo.setNumCamarotes(numCamarotes);

        return yateDeLujo;
    }

    @Override
    public double calcularModulo(Barco barco) {
        return super.calcularModulo(((YateDeLujo) barco))+((YateDeLujo) barco).getPotenciaCV()+((YateDeLujo) barco).getNumCamarotes();
    }
}
