/*package ejercicioExtra4.servicio;

import ejercicioExtra4.entidades.Empleado;
import ejercicioExtra4.enums.Seccion;

public class EmpleadoService extends PersonaServicio {
    Empleado empleado = new Empleado();

    public void reasignacionDespacho(Empleado empleado){
        System.out.println("Ingrese el nuevo numero de despacho");
        empleado.setNumeroDespacho(scanner.nextInt());

    }

    public void trasladoSeccion(Empleado empleado){
        System.out.println("¿Cual de los siguientes despachos desea asignar?");
        for (int i = 0; i < Seccion.values().length; i++) {
            System.out.println("Despacho #" +(i+1));
            System.out.println(Seccion.values()[i]);
        }

        int eleccion = scanner.nextByte();

        empleado.setSeccion(Seccion.values()[eleccion-1]);
    }


    @Override
    public String imprimirInformacion() {
        String respuesta = super.imprimirInformacion() + " "+
                empleado.getNumeroDespacho() + " "+
                empleado.getAnioIncorporacion() + " "+
                empleado.getSeccion();
        return respuesta;
    }
}

 */
