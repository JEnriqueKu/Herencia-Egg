package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Televisor;

import java.util.Scanner;

public class TelevisionService extends ElectrodomesticosService{

    public Televisor crearTelevisor(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Televisor televisor = new Televisor();

        Electrodomestico electrodomestico = super.crearElectrodomestico();

        televisor.setPrecio(electrodomestico.getPrecio());
        televisor.setPeso(electrodomestico.getPeso());
        televisor.setColor(electrodomestico.getColor());
        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());

        System.out.println("Ingrese la resolucion");
        //televisor.setResolucion(scanner.nextDouble());
        televisor.setResolucion(15);
        System.out.println("Ingrese si tiene sintonizador TDT (si o no)");
        //String respuesta= scanner.next();
        String respuesta= "si";
        televisor.setSintonizadorTDT(respuesta.equalsIgnoreCase("si"));

        return televisor;
    }

    public void precioFinal(Televisor televisor){
        super.precioFinal(televisor);

        if (televisor.getResolucion()>40) televisor.setPrecio(televisor.getPrecio()*1.30);
        if (televisor.isSintonizadorTDT()) televisor.setPrecio(televisor.getPrecio()+500);
    }
}
