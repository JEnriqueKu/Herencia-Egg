package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;

import java.util.Scanner;

public class LavadoraService extends ElectrodomesticosService{


    public Lavadora crearLavadora(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Lavadora lavadora = new Lavadora();

        Electrodomestico electrodomestico = super.crearElectrodomestico();

        lavadora.setColor(electrodomestico.getColor());
        lavadora.setPeso(electrodomestico.getPeso());
        lavadora.setPrecio(electrodomestico.getPrecio());
        lavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());

        System.out.println("Ingrese la carga");
        //lavadora.setCarga(scanner.nextDouble());
        lavadora.setCarga(30);

        return lavadora;
    }

    public void precioFinal(Lavadora lavadora){
        super.precioFinal(lavadora);

        if (lavadora.getCarga()>30) lavadora.setPrecio(lavadora.getPrecio()+500);
    }
}
