package ejercicioExtra1.entidades;

public class AMotor extends Barco{
    private int potenciaCV;

    public AMotor() {
    }

    public AMotor(int matricula, int eslora, int anioFabricacion, int potenciaCV) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "AMotor{" +
                "potenciaCV=" + potenciaCV +
                '}';
    }
}
