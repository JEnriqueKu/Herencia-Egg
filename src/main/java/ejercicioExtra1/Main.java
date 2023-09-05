package ejercicioExtra1;

import ejercicioExtra1.entidades.Alquiler;
import ejercicioExtra1.servicios.AlquilerService;

public class Main {

    public static void main(String[] args) {
        AlquilerService alquilerService = new AlquilerService();

        Alquiler alquiler1 = alquilerService.crearAlquiler2();

        System.out.println(alquilerService.calcularPrecioAlquiler(alquiler1));
    }
}
