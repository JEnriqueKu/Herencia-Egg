package ejercicioExtra1.servicios;

import ejercicioExtra1.entidades.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class AlquilerService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    BarcoService barcoService = new BarcoService();
    VeleroService veleroService = new VeleroService();
    AMotorService aMotorService = new AMotorService();
    YateDeLujoService yateDeLujoService = new YateDeLujoService();
    ArrayList<Alquiler> alquileres = new ArrayList<>();

    public void crearAlquiler(){
        System.out.println("Ingrese nombre del cliente");
        String nombre = scanner.next();
        System.out.println("Ingrese documento del cliente");
        String docCliente = scanner.next();
        System.out.println("Ingrese la fecha de alquiler (año mes dia)");
        LocalDate fechaAlquiler= LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Ingrese la fecha de devolución (año mes dia)");
        LocalDate fechaDevolucion= LocalDate.of(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        System.out.println("Ingrese posición amarre");
        int posicionAmarre= scanner.nextInt();

        System.out.println("Que tipo de barco desea alquilar");
        String tipoBarco = scanner.next();

        Barco barco;

        switch (tipoBarco.toLowerCase()){
            case "velero":
                barco = ((Velero) barcoService.crearBarco());
                break;
            case "a motor":
                barco = ((AMotor) barcoService.crearBarco());
                break;
            case "yate de lujo":
                    barco = ((YateDeLujo) barcoService.crearBarco());
                    break;
            default: barco = barcoService.crearBarco();
        }

        alquileres.add(new Alquiler(nombre,docCliente,fechaAlquiler,fechaDevolucion,posicionAmarre,barco));
    }
    public double calcularPrecioAlquiler(Alquiler alquiler){
        long diasOcupacion = ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(),alquiler.getFechaDevolucion());
        double modulo;
        if (alquiler.getBarco().getClass().getName().endsWith("Velero")) modulo= veleroService.calcularModulo(alquiler.getBarco());
        else if (alquiler.getBarco().getClass().getName().endsWith("AMotor"))modulo= aMotorService.calcularModulo(alquiler.getBarco());
        else if (alquiler.getBarco().getClass().getName().endsWith("YateDeLujo")) modulo=yateDeLujoService.calcularModulo(alquiler.getBarco());
        else modulo=barcoService.calcularModulo(alquiler.getBarco());

        return modulo*diasOcupacion;
    }

    public void mostraralquileres(){
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler);
        }
    }

    public Alquiler crearAlquiler2() {
        System.out.println("Ingrese nombre del cliente");
        String nombre = scanner.next();
        System.out.println("Ingrese documento del cliente");
        String docCliente = scanner.next();
        System.out.println("Ingrese la fecha de alquiler (año mes dia)");
        LocalDate fechaAlquiler = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Ingrese la fecha de devolución (año mes dia)");
        LocalDate fechaDevolucion = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println("Ingrese posición amarre");
        int posicionAmarre = scanner.nextInt();

        System.out.println("Que tipo de barco desea alquilar");
        String tipoBarco = scanner.next();

        switch (tipoBarco.toLowerCase()) {
            case "velero":
                Velero velero = (Velero) veleroService.crearBarco();
                return new Alquiler(nombre, docCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, velero);
            case "a motor":
                AMotor aMotor = ((AMotor) aMotorService.crearBarco());
                return new Alquiler(nombre, docCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, aMotor);
            case "yate de lujo":
                YateDeLujo yateDeLujo = ((YateDeLujo) yateDeLujoService.crearBarco());
                return new Alquiler(nombre, docCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, yateDeLujo);
            default:
                Barco barco = barcoService.crearBarco();
                return new Alquiler(nombre, docCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        }
    }

}
