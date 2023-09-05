package ejercicioExtra1.servicios;

import ejercicioExtra1.entidades.Barco;

import java.util.Scanner;

public class BarcoService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Barco crearBarco(){
        System.out.println("Ingrese la matricula del barco");
        int matricula = scanner.nextInt();
        System.out.println("Ingrese la eslora");
        int eslora = scanner.nextInt();
        System.out.println("Ingrese el año de fabricacion");
        int anioFabricacion = scanner.nextInt();

        return new Barco(matricula,eslora,anioFabricacion);
    }


    public double calcularModulo(Barco barco){
        return barco.getEslora()*10;
    }
}
