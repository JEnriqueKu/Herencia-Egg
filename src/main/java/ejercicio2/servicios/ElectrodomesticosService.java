package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectrodomesticosService {
    public char comprobarConsumoEnergetico(char letra){
        if (letra<='f' && letra>='a') return letra;

        return 'f';
    }

    public String comprobarColor(String color){
        return switch (color.toLowerCase()) {
            case "blanco" -> "Blanco";
            case "negro" -> "Negro";
            case "rojo" -> "Rojo";
            case "azul" -> "Azul";
            case "gris" -> "Gris";
            default -> "Blanco";
        };
    }

    public Electrodomestico crearElectrodomestico(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();

        electrodomestico.setPrecio(1000);

        System.out.println("Ingrese el color");
        //electrodomestico.setColor(scanner.next());
        electrodomestico.setColor("Azul");
        electrodomestico.setColor(comprobarColor(electrodomestico.getColor()));

        System.out.println("Ingrese el consumo energético");
        //electrodomestico.setConsumoEnergetico(scanner.next().charAt(0));
        electrodomestico.setConsumoEnergetico('a');
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(electrodomestico.getConsumoEnergetico()));

        System.out.println("Ingrese el peso");
        //electrodomestico.setPeso(scanner.nextDouble());
        electrodomestico.setPeso(12);

        return electrodomestico;
    }

    public void precioFinal(Electrodomestico electrodomestico){

        switch (electrodomestico.getConsumoEnergetico()) {
            case 'a' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
            case 'b' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
            case 'c' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 600);
            case 'd' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
            case 'e' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 300);
            case 'f' -> electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
        }

        if (electrodomestico.getPeso()<=19&& electrodomestico.getPeso()>=1) electrodomestico.setPrecio(electrodomestico.getPrecio()+100);
        else if (electrodomestico.getPeso()<=49&& electrodomestico.getPeso()>=20) electrodomestico.setPrecio(electrodomestico.getPrecio()+500);
        else if (electrodomestico.getPeso()<=79&& electrodomestico.getPeso()>=50) electrodomestico.setPrecio(electrodomestico.getPrecio()+800);
        else if (electrodomestico.getPeso()>80) electrodomestico.setPrecio(electrodomestico.getPrecio()+1000);
    }

    public void calcularSumatorias(ArrayList<Electrodomestico> electrodomesticos){
        double precioTelevisores =0;
        double precioLavadoras =0;
        TelevisionService televisionService = new TelevisionService();
        LavadoraService lavadoraService = new LavadoraService();

        for (Electrodomestico electrodomestico : electrodomesticos) {

            if (electrodomestico.getClass().getName().endsWith("Televisor")){
                televisionService.precioFinal(((Televisor) electrodomestico));

                precioTelevisores += electrodomestico.getPrecio();
                System.out.println(electrodomestico.getPrecio());


            } else if (electrodomestico.getClass().getName().endsWith("Lavadora")) {
                lavadoraService.precioFinal(((Lavadora) electrodomestico));

                precioLavadoras += electrodomestico.getPrecio();
                System.out.println(electrodomestico.getPrecio());
            }
        }

        System.out.println("El precio de todos los televisores es: " + precioTelevisores);
        System.out.println("El precio de todas las lavadoras es: " + precioLavadoras);

        System.out.println("El precio total es " + (precioLavadoras+precioTelevisores));

    }
}
