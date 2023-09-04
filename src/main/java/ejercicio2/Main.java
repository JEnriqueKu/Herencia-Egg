package ejercicio2;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Lavadora;
import ejercicio2.entidades.Televisor;
import ejercicio2.servicios.ElectrodomesticosService;
import ejercicio2.servicios.LavadoraService;
import ejercicio2.servicios.TelevisionService;

import java.util.ArrayList;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {

        TelevisionService televisionService = new TelevisionService();
        LavadoraService lavadoraService = new LavadoraService();
        ElectrodomesticosService electrodomesticosService = new ElectrodomesticosService();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();


        electrodomesticos.add(televisionService.crearTelevisor());
        electrodomesticos.add(televisionService.crearTelevisor());
        electrodomesticos.add(lavadoraService.crearLavadora());
        electrodomesticos.add(lavadoraService.crearLavadora());

        electrodomesticosService.calcularSumatorias(electrodomesticos);

    }



}
