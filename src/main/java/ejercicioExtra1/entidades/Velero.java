package ejercicioExtra1.entidades;

public class Velero extends Barco{
    private int numMastiles;

    public Velero() {
    }

    public Velero(int matricula, int eslora, int anioFabricacion, int numMastiles) {
        super(matricula, eslora, anioFabricacion);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" +
                "numMastiles=" + numMastiles +
                '}';
    }
}
