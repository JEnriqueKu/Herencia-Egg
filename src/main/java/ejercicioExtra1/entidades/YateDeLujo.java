package ejercicioExtra1.entidades;

public class YateDeLujo extends Barco{
    private int potenciaCV;
    private int numCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int matricula, int eslora, int anioFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public String toString() {
        return "YateDeLujo{" +
                "potenciaCV=" + potenciaCV +
                ", numCamarotes=" + numCamarotes +
                '}';
    }
}
