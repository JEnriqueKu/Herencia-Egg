package ejercicio1;

public class Main {
    public static void main(String[] args) {
        //Perro
        Animal perro = new Perro("Copo","carne",15,"Snauser");
        perro.alimentarse();

        //Gato
        Animal gato = new Gato("Shira", "croquetas", 2, "Siamés");
        gato.alimentarse();

        //Caballo
        Animal caballo = new Animal("Silver", "pasto", 4, "Fino");
        caballo.alimentarse();

    }
}
